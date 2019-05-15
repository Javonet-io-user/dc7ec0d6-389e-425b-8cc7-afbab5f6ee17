package external_drive_lib.util;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import external_drive_lib.util.*;
import jio.System.Collections.Generic.*;

public class usb_util {
  protected NObject javonetHandle;

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean pnp_device_id_to_vidpid_and_unique_id(
      java.lang.String device_id,
      AtomicReference<java.lang.String> vid_pid,
      AtomicReference<java.lang.String> unique_id) {
    try {
      java.lang.Boolean res =
          Javonet.getType("external_drive_lib.util.usb_util")
              .invoke(
                  "pnp_device_id_to_vidpid_and_unique_id",
                  device_id,
                  new NRef(vid_pid),
                  new NRef(unique_id));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean dependent_to_vidpid_and_unique_id(
      java.lang.String device_id,
      AtomicReference<java.lang.String> vid_pid,
      AtomicReference<java.lang.String> unique_id) {
    try {
      java.lang.Boolean res =
          Javonet.getType("external_drive_lib.util.usb_util")
              .invoke(
                  "dependent_to_vidpid_and_unique_id",
                  device_id,
                  new NRef(vid_pid),
                  new NRef(unique_id));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean portable_path_to_vidpid(
      java.lang.String path, AtomicReference<java.lang.String> vid_pid) {
    try {
      java.lang.Boolean res =
          Javonet.getType("external_drive_lib.util.usb_util")
              .invoke("portable_path_to_vidpid", path, new NRef(vid_pid));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static List<java.lang.String> get_all_portable_paths() {
    try {
      Object res =
          Javonet.getType("external_drive_lib.util.usb_util").invoke("get_all_portable_paths");
      if (res == null) return null;
      return new List<java.lang.String>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static List<java.lang.String> get_all_usb_pnp_device_ids() {
    try {
      Object res =
          Javonet.getType("external_drive_lib.util.usb_util").invoke("get_all_usb_pnp_device_ids");
      if (res == null) return null;
      return new List<java.lang.String>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static List<java.lang.String> get_all_usb_dependent_ids() {
    try {
      Object res =
          Javonet.getType("external_drive_lib.util.usb_util").invoke("get_all_usb_dependent_ids");
      if (res == null) return null;
      return new List<java.lang.String>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static List<Dictionary<java.lang.String, java.lang.String>> get_all_usb_pnp_device_info() {
    try {
      Object res =
          Javonet.getType("external_drive_lib.util.usb_util").invoke("get_all_usb_pnp_device_info");
      if (res == null) return null;
      return new List<Dictionary<java.lang.String, java.lang.String>>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String unique_id_from_root_path(java.lang.String root_path) {
    try {
      java.lang.String res =
          Javonet.getType("external_drive_lib.util.usb_util")
              .invoke("unique_id_from_root_path", root_path);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void monitor_usb_devices(java.lang.String usb_class) {
    try {
      Javonet.getType("external_drive_lib.util.usb_util").invoke("monitor_usb_devices", usb_class);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
