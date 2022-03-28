package me.khazaddum.spring.m02.concept.c04_container;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.FactoryBean;

public class MyDeltaFactoryBean implements FactoryBean<BeanDelta> {

	private static final Logger LOG = LoggerFactory.getLogger(MyDeltaFactoryBean.class);

	public MyDeltaFactoryBean() {
		LOG.info("Created");
	}

	@Override
	public boolean isSingleton() {
		LOG.info("Running isSingleton");
		return true;
	}

	@Override
	public BeanDelta getObject() throws Exception {
		LOG.info("Running getObject");
		return new BeanDelta();
	}

	@Override
	public Class<?> getObjectType() {
		// LOG.info("Running getObjectType");
		return BeanDelta.class;
	}

}
