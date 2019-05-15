package external_drive_lib.interfaces;

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
import external_drive_lib.interfaces.*;
import jio.System.Collections.Generic.*;

public interface IDrive {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean is_connected();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean is_available();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IFile parse_file(java.lang.String path);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IFolder parse_folder(java.lang.String path);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IFile try_parse_file(java.lang.String path);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IFolder try_parse_folder(java.lang.String path);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IFolder create_folder(java.lang.String folder);
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public drive_type gettype();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getroot_name();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getunique_id();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getfriendly_name();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public IEnumerable<IFolder> getfolders();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public IEnumerable<IFile> getfiles();
}
