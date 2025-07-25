package com.github.Axcol3.spring.postprocess.processor;

import com.github.Axcol3.spring.postprocess.annotation.Discount;
import com.github.Axcol3.spring.postprocess.bean.Food;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

@Component
public class DiscountBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof Food food) {
           Class<Food> foodClass = (Class<Food>) bean.getClass();
           try{
               Field discountField = foodClass.getDeclaredField("discount");
                if(discountField.isAnnotationPresent(Discount.class) && food.getType().equals("Pasta")) {
                    Discount discount = discountField.getAnnotation(Discount.class);
                    food.setDiscount(discount.percnt());
                }
           }catch (NoSuchFieldException e){
               throw new RuntimeException(e);
           }
        }
        return bean;
    }
}
