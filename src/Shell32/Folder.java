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

public interface Folder {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public FolderItems Items();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public FolderItem ParseName(java.lang.String bName);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void NewFolder(java.lang.String bName, Object vOptions);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void MoveHere(Object vItem, Object vOptions);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void CopyHere(Object vItem, Object vOptions);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetDetailsOf(Object vItem, java.lang.Integer iColumn);
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getTitle();
}
