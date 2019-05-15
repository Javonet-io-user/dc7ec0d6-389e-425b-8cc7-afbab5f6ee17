package external_drive_lib.monitor;

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
import external_drive_lib.monitor.*;
import jio.System.Collections.Generic.*;
import jio.System.*;

public class monitor_devices {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public ActionT<Dictionary<java.lang.String, java.lang.String>> getadded_device() {
    try {
      Object res = javonetHandle.<NObject>get("added_device");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setadded_device(ActionT<Dictionary<java.lang.String, java.lang.String>> param) {
    try {
      javonetHandle.set("added_device", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public ActionT<Dictionary<java.lang.String, java.lang.String>> getdeleted_device() {
    try {
      Object res = javonetHandle.<NObject>get("deleted_device");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setdeleted_device(ActionT<Dictionary<java.lang.String, java.lang.String>> param) {
    try {
      javonetHandle.set("deleted_device", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public monitor_devices() {
    try {
      javonetHandle = Javonet.New("external_drive_lib.monitor.monitor_devices");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public monitor_devices(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void monitor(java.lang.String class_name) {
    try {
      javonetHandle.invoke("monitor", class_name);
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
