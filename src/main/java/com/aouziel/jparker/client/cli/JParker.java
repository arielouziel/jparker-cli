package com.aouziel.jparker.client.cli;

import picocli.CommandLine;

@CommandLine.Command(
        name = "jparker",
        subcommands = {
                CreateParkingLot.class,
                CreateSlot.class,
                EnterParkingLot.class,
                LeaveParkingLot.class
        },
        mixinStandardHelpOptions = true,
        version = "jparker - version 0.0.1",
        description = "JParker CLI is a cli line tool allowing access to a remote JParker REST API ",
        commandListHeading = "%nCommands:%n%nThe most commonly used jparker commands are:%n")
public class JParker {
    @CommandLine.Option(names = {"-p", "--path"}, description = "Base path of JParker REST API")
    private String path = "http://localhost:8080";

    String getPath() {
        return path;
    }
}
