package me.khazaddum.sf.infrastructure.injection.pet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PetService {

    private static final Logger LOG = LoggerFactory.getLogger(PetService.class);

    @Autowired
    private PetRepository repository1;

    @Autowired
    private PetRepository repository2;

    public PetService() {
        LOG.info("Created");
    }

}
