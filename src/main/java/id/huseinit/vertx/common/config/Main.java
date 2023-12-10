package id.huseinit.vertx.common.config;

import java.util.Optional;

public class Main {
  public static void main(String[] args) {
    Optional<String> version = Optional.ofNullable(Main.class.getPackage().getImplementationVersion());
    String packageName = Main.class.getPackageName();
    System.out.println(packageName + (version.map(s -> "-" + s).orElse(""))); // NOSONAR
  }
}
