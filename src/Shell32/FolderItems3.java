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
import jio.System.Collections.*;

public interface FolderItems3 extends FolderItems2, FolderItems, IEnumerable {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void Filter(java.lang.Integer grfFlags, java.lang.String bstrFileSpec);
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getCount();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public FolderItemVerbs getVerbs();
}
