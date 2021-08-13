package dom.std.global

import dom.std.BufferSource
import dom.std.WebAssembly.CompileError
import dom.std.WebAssembly.Global
import dom.std.WebAssembly.GlobalDescriptor
import dom.std.WebAssembly.Imports
import dom.std.WebAssembly.Instance
import dom.std.WebAssembly.LinkError
import dom.std.WebAssembly.Memory
import dom.std.WebAssembly.MemoryDescriptor
import dom.std.WebAssembly.Module
import dom.std.WebAssembly.ModuleExportDescriptor
import dom.std.WebAssembly.ModuleImportDescriptor
import dom.std.WebAssembly.RuntimeError
import dom.std.WebAssembly.Table
import dom.std.WebAssembly.TableDescriptor
import dom.std.WebAssembly.WebAssemblyInstantiatedSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WebAssembly {
  
  @JSGlobal("WebAssembly")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.CompileError")
  @js.native
  class CompileErrorCls ()
    extends StObject
       with CompileError
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.Global")
  @js.native
  class GlobalCls protected ()
    extends StObject
       with Global {
    def this(descriptor: GlobalDescriptor) = this()
    def this(descriptor: GlobalDescriptor, v: js.Any) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.Instance")
  @js.native
  class InstanceCls protected ()
    extends StObject
       with Instance {
    def this(module: Module) = this()
    def this(module: Module, importObject: Imports) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.LinkError")
  @js.native
  class LinkErrorCls ()
    extends StObject
       with LinkError
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.Memory")
  @js.native
  class MemoryCls protected ()
    extends StObject
       with Memory {
    def this(descriptor: MemoryDescriptor) = this()
  }
  
  object Module {
    
    @JSGlobal("WebAssembly.Module")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def customSections(moduleObject: dom.std.WebAssembly.Module, sectionName: java.lang.String): js.Array[dom.std.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("customSections")(moduleObject.asInstanceOf[js.Any], sectionName.asInstanceOf[js.Any])).asInstanceOf[js.Array[dom.std.ArrayBuffer]]
    
    @scala.inline
    def exports(moduleObject: dom.std.WebAssembly.Module): js.Array[ModuleExportDescriptor] = ^.asInstanceOf[js.Dynamic].applyDynamic("exports")(moduleObject.asInstanceOf[js.Any]).asInstanceOf[js.Array[ModuleExportDescriptor]]
    
    @scala.inline
    def imports(moduleObject: dom.std.WebAssembly.Module): js.Array[ModuleImportDescriptor] = ^.asInstanceOf[js.Dynamic].applyDynamic("imports")(moduleObject.asInstanceOf[js.Any]).asInstanceOf[js.Array[ModuleImportDescriptor]]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.Module")
  @js.native
  class ModuleCls protected ()
    extends StObject
       with Module {
    def this(bytes: BufferSource) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.RuntimeError")
  @js.native
  class RuntimeErrorCls ()
    extends StObject
       with RuntimeError
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.Table")
  @js.native
  class TableCls protected ()
    extends StObject
       with Table {
    def this(descriptor: TableDescriptor) = this()
  }
  
  @scala.inline
  def compile(bytes: BufferSource): js.Promise[Module] = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(bytes.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Module]]
  
  @scala.inline
  def compileStreaming(source: dom.std.Response): js.Promise[Module] = ^.asInstanceOf[js.Dynamic].applyDynamic("compileStreaming")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Module]]
  @scala.inline
  def compileStreaming(source: js.Promise[dom.std.Response]): js.Promise[Module] = ^.asInstanceOf[js.Dynamic].applyDynamic("compileStreaming")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Module]]
  
  @scala.inline
  def instantiate(bytes: BufferSource): js.Promise[WebAssemblyInstantiatedSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("instantiate")(bytes.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WebAssemblyInstantiatedSource]]
  @scala.inline
  def instantiate(bytes: BufferSource, importObject: Imports): js.Promise[WebAssemblyInstantiatedSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiate")(bytes.asInstanceOf[js.Any], importObject.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WebAssemblyInstantiatedSource]]
  @scala.inline
  def instantiate(moduleObject: Module): js.Promise[Instance] = ^.asInstanceOf[js.Dynamic].applyDynamic("instantiate")(moduleObject.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Instance]]
  @scala.inline
  def instantiate(moduleObject: Module, importObject: Imports): js.Promise[Instance] = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiate")(moduleObject.asInstanceOf[js.Any], importObject.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Instance]]
  
  @scala.inline
  def instantiateStreaming(response: dom.std.Response): js.Promise[WebAssemblyInstantiatedSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("instantiateStreaming")(response.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WebAssemblyInstantiatedSource]]
  @scala.inline
  def instantiateStreaming(response: dom.std.Response, importObject: Imports): js.Promise[WebAssemblyInstantiatedSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiateStreaming")(response.asInstanceOf[js.Any], importObject.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WebAssemblyInstantiatedSource]]
  @scala.inline
  def instantiateStreaming(response: js.Thenable[dom.std.Response]): js.Promise[WebAssemblyInstantiatedSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("instantiateStreaming")(response.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WebAssemblyInstantiatedSource]]
  @scala.inline
  def instantiateStreaming(response: js.Thenable[dom.std.Response], importObject: Imports): js.Promise[WebAssemblyInstantiatedSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiateStreaming")(response.asInstanceOf[js.Any], importObject.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WebAssemblyInstantiatedSource]]
  
  @scala.inline
  def validate(bytes: BufferSource): scala.Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(bytes.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
}
