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

public interface IFolder {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void delete_async();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void delete_sync();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getname();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getexists();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getfull_path();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public IDrive getdrive();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public IFolder getparent();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public IEnumerable<IFile> getfiles();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public IEnumerable<IFolder> getchild_folders();
}
