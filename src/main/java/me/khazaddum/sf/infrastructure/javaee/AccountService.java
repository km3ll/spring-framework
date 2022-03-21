package me.khazaddum.sf.infrastructure.javaee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

@Service
public class AccountService {

	private static final Logger LOG = LoggerFactory.getLogger(AccountService.class);

	private IAccountRepository mainRepository;

	private IAccountRepository backupRepository;

	private IAccountRepository inMemoryRepository;

	public AccountService() {
		LOG.info("Created");
	}

	@Resource(name = "accountRepositoryCacheImpl")
	public void setMainRepository(IAccountRepository mainRepository) {
		this.mainRepository = mainRepository;
		LOG.info("accountRepositoryCache wired");
	}

	@Resource(name = "accountRepositoryDbImpl")
	public void setBackupRepository(IAccountRepository backupRepository) {
		this.backupRepository = backupRepository;
		LOG.info("accountRepositoryDb wired");
	}

	@Inject
	@Named("accountRepositoryH2Impl")
	public void setInMemoryRepository(IAccountRepository inMemoryRepository) {
		this.inMemoryRepository = inMemoryRepository;
		LOG.info("accountRepositoryH2 wired");
	}

}
