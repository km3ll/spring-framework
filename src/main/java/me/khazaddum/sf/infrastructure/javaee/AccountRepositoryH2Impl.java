package me.khazaddum.sf.infrastructure.javaee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AccountRepositoryH2Impl implements IAccountRepository {

	private static final Logger LOG = LoggerFactory.getLogger(AccountRepositoryH2Impl.class);

	public AccountRepositoryH2Impl() {
		LOG.info("Created");
	}

}
