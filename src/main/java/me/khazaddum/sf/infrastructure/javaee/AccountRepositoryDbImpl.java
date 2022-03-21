package me.khazaddum.sf.infrastructure.javaee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AccountRepositoryDbImpl implements IAccountRepository {

	private static final Logger LOG = LoggerFactory.getLogger(AccountRepositoryDbImpl.class);

	public AccountRepositoryDbImpl() {
		LOG.info("Created");
	}

}
