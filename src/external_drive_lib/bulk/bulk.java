package external_drive_lib.bulk;

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
import external_drive_lib.bulk.*;
import jio.System.*;
import external_drive_lib.interfaces.*;
import jio.System.Collections.Generic.*;

public class bulk {
  protected NObject javonetHandle;

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void bulk_copy_sync(
      java.lang.String src_folder,
      java.lang.String dest_folder,
      ActionT1T2T3<java.lang.String, java.lang.Integer, java.lang.Integer> copy_complete_callback) {
    try {
      Javonet.getType("external_drive_lib.bulk.bulk")
          .invoke("bulk_copy_sync", src_folder, dest_folder, copy_complete_callback);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void bulk_copy_async(
      java.lang.String src_folder,
      java.lang.String dest_folder,
      ActionT1T2T3<java.lang.String, java.lang.Integer, java.lang.Integer> copy_complete_callback) {
    try {
      Javonet.getType("external_drive_lib.bulk.bulk")
          .invoke("bulk_copy_async", src_folder, dest_folder, copy_complete_callback);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void bulk_copy_sync(
      IReadOnlyList<IFile> src_files,
      java.lang.String dest_folder,
      ActionT1T2T3<java.lang.String, java.lang.Integer, java.lang.Integer> copy_complete_callback) {
    try {
      Javonet.getType("external_drive_lib.bulk.bulk")
          .invoke("bulk_copy_sync", src_files, dest_folder, copy_complete_callback);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void bulk_copy_async(
      IReadOnlyList<IFile> src_files,
      java.lang.String dest_folder,
      ActionT1T2T3<java.lang.String, java.lang.Integer, java.lang.Integer> copy_complete_callback) {
    try {
      Javonet.getType("external_drive_lib.bulk.bulk")
          .invoke("bulk_copy_async", src_files, dest_folder, copy_complete_callback);
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
