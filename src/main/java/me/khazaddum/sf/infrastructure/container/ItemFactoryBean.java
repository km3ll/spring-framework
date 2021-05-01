package me.khazaddum.sf.infrastructure.container;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.FactoryBean;

public class ItemFactoryBean implements FactoryBean<Item> {

    private static final Logger LOG = LoggerFactory.getLogger(ItemFactoryBean.class);

    @Override
    public boolean isSingleton() {
        LOG.info("Running isSingleton");
        return true;
    }

    @Override
    public Item getObject() throws Exception {
        LOG.info("Running getObject");
        return new Item(80001, "spoon");
    }

    @Override
    public Class<?> getObjectType() {
        LOG.info("Running getObjectType");
        return Item.class;
    }

}
