package external_drive_lib.interfaces;

public enum drive_type {
  portable(0L),
  android_unknown(1L),
  android_phone(2L),
  android_tablet(3L),
  iOS_unknown(4L),
  iphone(5L),
  ipad(6L),
  sd_card(7L),
  external_hdd(8L),
  internal_hdd(9L),
  cd_rom(10L),
  ;
  private long numVal;

  drive_type(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
