package com.tmoodini.io;

import java.io.IOException;
import java.nio.file.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DirectoryWatcher {
        public static void main(String[] args)  {
            Logger logger = Logger.getLogger(DirectoryWatcher.class.getName());
            WatchService watchService = null;
            try {
                 watchService
                        = FileSystems.getDefault().newWatchService();

            }catch(Exception e){
                logger.log(Level.SEVERE, e.getMessage() + "GET WATCHER ERROR");
            }
            Path path = Path.of("/Users/tommoody/test");

            try {
                path.register(
                        watchService,
                        StandardWatchEventKinds.ENTRY_CREATE,
                        StandardWatchEventKinds.ENTRY_DELETE,
                        StandardWatchEventKinds.ENTRY_MODIFY);

                WatchKey key;
                while ((key = watchService.take()) != null) {
                    for (WatchEvent<?> event : key.pollEvents()) {
                        System.out.println(
                                "Event kind:" + event.kind()
                                        + ". File affected: " + event.context() + ".");
                    }
                    key.reset();
                }
            }catch(Exception e){
                logger.log(Level.SEVERE, e.getMessage() + "WATCHING ERROR");
                }

        }
    }

