package me.khazaddum.sf.infrastructure.commandline;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineComponent implements CommandLineRunner {

    private static final Logger LOG = LoggerFactory.getLogger(CommandLineComponent.class);

    public CommandLineComponent() {
        super();
        LOG.info("Created");
    }

    @Override
    public void run(String... args) throws Exception {
        LOG.info("Run");
    }

}
