package Shell32;

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
import Shell32.*;
import jio.System.*;

public interface FolderItem {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public FolderItemVerbs Verbs();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void InvokeVerb(Object vVerb);
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Object getParent();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getName();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getPath();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Object getGetFolder();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsLink();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsFolder();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getSize();
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setName(java.lang.String pbs);
}
