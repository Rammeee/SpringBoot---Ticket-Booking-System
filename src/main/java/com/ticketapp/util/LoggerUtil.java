package com.ticketapp.util;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class LoggerUtil {

    public static void logError(String message) {

        try {

            FileWriter writer =
                    new FileWriter(
                            "error.log",
                            true
                    );

            writer.write(
                    LocalDateTime.now()
                    + " - "
                    + message
                    + "\n"
            );

            writer.close();

        } catch (IOException e) {

            System.out.println(
                    "Error writing log file"
            );
        }
    }
}