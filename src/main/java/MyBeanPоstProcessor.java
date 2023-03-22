import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyBeanPostProcessor::BeforeInitialization();");
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyBeanPostProcessor::AfterInitialization();");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
