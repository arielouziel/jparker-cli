package com.aouziel.jparker.client;

import com.aouziel.jparker.client.cli.JParker;
import picocli.CommandLine;

public class JParkerCli {
    public static void main(final String[] args) {
        CommandLine cmd = new CommandLine(new JParker());
        try {
            cmd.parseWithHandler(new CommandLine.RunLast(), args);
        } catch (Exception ex) {
            cmd.usage(System.err);
        }
    }
}