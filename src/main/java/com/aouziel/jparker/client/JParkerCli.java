package com.aouziel.jparker.client;

import com.aouziel.jparker.client.cli.JParker;
import picocli.CommandLine;

public class JParkerCli {
    public static void main(final String[] args) {
        CommandLine commandLine = new CommandLine(new JParker());
        try {
            commandLine.parseWithHandler(new CommandLine.RunLast(), args);
        } catch (CommandLine.PicocliException exc) {
            exc.printStackTrace();
            commandLine.usage(System.err);
        }

    }
}