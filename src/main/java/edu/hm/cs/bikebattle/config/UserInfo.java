package edu.hm.cs.bikebattle.config;

import lombok.Data;
import lombok.NonNull;

/**
 * Organization: HM FK07.
 * Project: BikeBattleBackend, edu.hm.cs.bikebattle.config
 * Author(s): Rene Zarwel
 * Date: 04.05.16
 * OS: MacOS 10.11
 * Java-Version: 1.8
 * System: 2,3 GHz Intel Core i7, 16 GB 1600 MHz DDR3
 */
@Data
public class UserInfo {

  @NonNull String name;
  @NonNull String email;
}
