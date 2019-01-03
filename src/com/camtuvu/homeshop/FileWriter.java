package com.camtuvu.homeshop;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWriter implements Writer {
  private String fileName;
  private Path path;
  private String content;

  public FileWriter(String fileName) {
    this.fileName = fileName;
  }

  @Override
  public void start() {
    path = Paths.get(fileName);
    content = "";
  }

  @Override
  public void writeLine(String line) {
    content += line + "%n";

  }

  @Override
  public void stop() {
    try {
      Files.write(path, String.format(content).getBytes());
    }catch (IOException e){
      System.err.println("Impossible de rédiger la facture.");
    }

  }
}
