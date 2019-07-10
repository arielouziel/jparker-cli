package com.aouziel.jparker.client;

import com.aouziel.jparker.client.cli.JParker;
import picocli.CommandLine;

public class JParkerCli {
    public static void main(final String[] args) {
        new CommandLine(new JParker()).parseWithHandler(new CommandLine.RunLast(), args);
    }
}