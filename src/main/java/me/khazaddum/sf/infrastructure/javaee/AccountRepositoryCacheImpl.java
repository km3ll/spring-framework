package me.khazaddum.sf.infrastructure.javaee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AccountRepositoryCacheImpl implements IAccountRepository {

	private static final Logger LOG = LoggerFactory.getLogger(AccountRepositoryCacheImpl.class);

	public AccountRepositoryCacheImpl() {
		LOG.info("Created");
	}

}
