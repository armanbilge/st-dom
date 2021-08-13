package dom.std

import dom.std.stdStrings.anyfunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WebAssembly {
  
  @js.native
  trait CompileError extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - js.Function
    - dom.std.WebAssembly.Global
    - dom.std.WebAssembly.Memory
    - dom.std.WebAssembly.Table
  */
  type ExportValue = _ExportValue | js.Function
  
  type Exports = Record[java.lang.String, ExportValue]
  
  @js.native
  trait Global
    extends StObject
       with _ExportValue {
    
    var value: js.Any = js.native
  }
  object Global {
    
    @scala.inline
    def apply(value: js.Any): Global = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Global]
    }
  }
  
  @js.native
  trait GlobalDescriptor extends StObject {
    
    var mutable: js.UndefOr[scala.Boolean] = js.native
    
    var value: ValueType = js.native
  }
  object GlobalDescriptor {
    
    @scala.inline
    def apply(value: ValueType, mutable: js.UndefOr[scala.Boolean] = js.undefined): GlobalDescriptor = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      if (!js.isUndefined(mutable)) __obj.updateDynamic("mutable")(mutable.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalDescriptor]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - dom.std.stdStrings.function
    - dom.std.stdStrings.global
    - dom.std.stdStrings.memory
    - dom.std.stdStrings.table
  */
  trait ImportExportKind extends StObject
  object ImportExportKind {
    
    @scala.inline
    def function: dom.std.stdStrings.function = "function".asInstanceOf[dom.std.stdStrings.function]
    
    @scala.inline
    def global: dom.std.stdStrings.global = "global".asInstanceOf[dom.std.stdStrings.global]
    
    @scala.inline
    def memory: dom.std.stdStrings.memory = "memory".asInstanceOf[dom.std.stdStrings.memory]
    
    @scala.inline
    def table: dom.std.stdStrings.table = "table".asInstanceOf[dom.std.stdStrings.table]
  }
  
  type ImportValue = ExportValue | Double
  
  type Imports = Record[java.lang.String, ModuleImports]
  
  @js.native
  trait Instance extends StObject {
    
    val exports: Exports = js.native
  }
  object Instance {
    
    @scala.inline
    def apply(exports: Exports): Instance = {
      val __obj = js.Dynamic.literal(exports = exports.asInstanceOf[js.Any])
      __obj.asInstanceOf[Instance]
    }
  }
  
  @js.native
  trait LinkError extends StObject
  
  @js.native
  trait Memory
    extends StObject
       with _ExportValue {
    
    val buffer: ArrayBuffer = js.native
    
    def grow(delta: Double): Double = js.native
  }
  object Memory {
    
    @scala.inline
    def apply(buffer: ArrayBuffer, grow: Double => Double): Memory = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], grow = js.Any.fromFunction1(grow))
      __obj.asInstanceOf[Memory]
    }
  }
  
  @js.native
  trait MemoryDescriptor extends StObject {
    
    var initial: Double = js.native
    
    var maximum: js.UndefOr[Double] = js.native
    
    var shared: js.UndefOr[scala.Boolean] = js.native
  }
  object MemoryDescriptor {
    
    @scala.inline
    def apply(
      initial: Double,
      maximum: js.UndefOr[Double] = js.undefined,
      shared: js.UndefOr[scala.Boolean] = js.undefined
    ): MemoryDescriptor = {
      val __obj = js.Dynamic.literal(initial = initial.asInstanceOf[js.Any])
      if (!js.isUndefined(maximum)) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
      if (!js.isUndefined(shared)) __obj.updateDynamic("shared")(shared.asInstanceOf[js.Any])
      __obj.asInstanceOf[MemoryDescriptor]
    }
  }
  
  @js.native
  trait Module extends StObject
  
  @js.native
  trait ModuleExportDescriptor extends StObject {
    
    var kind: ImportExportKind = js.native
    
    var name: java.lang.String = js.native
  }
  object ModuleExportDescriptor {
    
    @scala.inline
    def apply(kind: ImportExportKind, name: java.lang.String): ModuleExportDescriptor = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleExportDescriptor]
    }
  }
  
  @js.native
  trait ModuleImportDescriptor extends StObject {
    
    var kind: ImportExportKind = js.native
    
    var module: java.lang.String = js.native
    
    var name: java.lang.String = js.native
  }
  object ModuleImportDescriptor {
    
    @scala.inline
    def apply(kind: ImportExportKind, module: java.lang.String, name: java.lang.String): ModuleImportDescriptor = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleImportDescriptor]
    }
  }
  
  type ModuleImports = Record[java.lang.String, ImportValue]
  
  @js.native
  trait RuntimeError extends StObject
  
  @js.native
  trait Table
    extends StObject
       with _ExportValue {
    
    def get(index: Double): js.Function | Null = js.native
    
    def grow(delta: Double): Double = js.native
    
    val length: Double = js.native
    
    def set(index: Double): Unit = js.native
    def set(index: Double, value: js.Function): Unit = js.native
  }
  
  @js.native
  trait TableDescriptor extends StObject {
    
    var element: TableKind = js.native
    
    var initial: Double = js.native
    
    var maximum: js.UndefOr[Double] = js.native
  }
  object TableDescriptor {
    
    @scala.inline
    def apply(element: TableKind, initial: Double, maximum: js.UndefOr[Double] = js.undefined): TableDescriptor = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any])
      if (!js.isUndefined(maximum)) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableDescriptor]
    }
  }
  
  type TableKind = anyfunc
  
  /* Rewritten from type alias, can be one of: 
    - dom.std.stdStrings.f32
    - dom.std.stdStrings.f64
    - dom.std.stdStrings.i32
    - dom.std.stdStrings.i64
  */
  trait ValueType extends StObject
  object ValueType {
    
    @scala.inline
    def f32: dom.std.stdStrings.f32 = "f32".asInstanceOf[dom.std.stdStrings.f32]
    
    @scala.inline
    def f64: dom.std.stdStrings.f64 = "f64".asInstanceOf[dom.std.stdStrings.f64]
    
    @scala.inline
    def i32: dom.std.stdStrings.i32 = "i32".asInstanceOf[dom.std.stdStrings.i32]
    
    @scala.inline
    def i64: dom.std.stdStrings.i64 = "i64".asInstanceOf[dom.std.stdStrings.i64]
  }
  
  @js.native
  trait WebAssemblyInstantiatedSource extends StObject {
    
    var instance: Instance = js.native
    
    var module: Module = js.native
  }
  object WebAssemblyInstantiatedSource {
    
    @scala.inline
    def apply(instance: Instance, module: Module): WebAssemblyInstantiatedSource = {
      val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebAssemblyInstantiatedSource]
    }
  }
  
  trait _ExportValue extends StObject
}
