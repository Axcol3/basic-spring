package com.github.Axcol3.spring.postprocess.processor;

import com.github.Axcol3.spring.postprocess.bean.Waiter;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class WaiterOnDutyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof Waiter){
            ((Waiter)bean).setOnDuty(false);
        }
        return bean;
    }
}
