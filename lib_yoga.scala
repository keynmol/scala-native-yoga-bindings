package lib_yoga

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

object predef:
  private[lib_yoga] trait _BindgenEnumCUnsignedInt[T](using eq: T =:= CUnsignedInt):
    given Tag[T] = Tag.UInt.asInstanceOf[Tag[T]]
    extension (inline t: T)
     inline def value: CUnsignedInt = eq.apply(t)
     inline def int: CInt = eq.apply(t).toInt
     inline def uint: CUnsignedInt = eq.apply(t)


object enumerations:
  import predef.*
  opaque type YGAlign = CUnsignedInt
  object YGAlign extends _BindgenEnumCUnsignedInt[YGAlign]:
    given _tag: Tag[YGAlign] = Tag.UInt
    inline def define(inline a: Long): YGAlign = a.toUInt
    val YGAlignAuto = define(0)
    val YGAlignFlexStart = define(1)
    val YGAlignCenter = define(2)
    val YGAlignFlexEnd = define(3)
    val YGAlignStretch = define(4)
    val YGAlignBaseline = define(5)
    val YGAlignSpaceBetween = define(6)
    val YGAlignSpaceAround = define(7)
    val YGAlignSpaceEvenly = define(8)
    inline def getName(inline value: YGAlign): Option[String] =
      inline value match
        case YGAlignAuto => Some("YGAlignAuto")
        case YGAlignFlexStart => Some("YGAlignFlexStart")
        case YGAlignCenter => Some("YGAlignCenter")
        case YGAlignFlexEnd => Some("YGAlignFlexEnd")
        case YGAlignStretch => Some("YGAlignStretch")
        case YGAlignBaseline => Some("YGAlignBaseline")
        case YGAlignSpaceBetween => Some("YGAlignSpaceBetween")
        case YGAlignSpaceAround => Some("YGAlignSpaceAround")
        case YGAlignSpaceEvenly => Some("YGAlignSpaceEvenly")
        case _ => _root_.scala.None
    extension (a: YGAlign)
      inline def &(b: YGAlign): YGAlign = a & b
      inline def |(b: YGAlign): YGAlign = a | b
      inline def is(b: YGAlign): Boolean = (a & b) == b

  opaque type YGBoxSizing = CUnsignedInt
  object YGBoxSizing extends _BindgenEnumCUnsignedInt[YGBoxSizing]:
    given _tag: Tag[YGBoxSizing] = Tag.UInt
    inline def define(inline a: Long): YGBoxSizing = a.toUInt
    val YGBoxSizingBorderBox = define(0)
    val YGBoxSizingContentBox = define(1)
    inline def getName(inline value: YGBoxSizing): Option[String] =
      inline value match
        case YGBoxSizingBorderBox => Some("YGBoxSizingBorderBox")
        case YGBoxSizingContentBox => Some("YGBoxSizingContentBox")
        case _ => _root_.scala.None
    extension (a: YGBoxSizing)
      inline def &(b: YGBoxSizing): YGBoxSizing = a & b
      inline def |(b: YGBoxSizing): YGBoxSizing = a | b
      inline def is(b: YGBoxSizing): Boolean = (a & b) == b

  opaque type YGDimension = CUnsignedInt
  object YGDimension extends _BindgenEnumCUnsignedInt[YGDimension]:
    given _tag: Tag[YGDimension] = Tag.UInt
    inline def define(inline a: Long): YGDimension = a.toUInt
    val YGDimensionWidth = define(0)
    val YGDimensionHeight = define(1)
    inline def getName(inline value: YGDimension): Option[String] =
      inline value match
        case YGDimensionWidth => Some("YGDimensionWidth")
        case YGDimensionHeight => Some("YGDimensionHeight")
        case _ => _root_.scala.None
    extension (a: YGDimension)
      inline def &(b: YGDimension): YGDimension = a & b
      inline def |(b: YGDimension): YGDimension = a | b
      inline def is(b: YGDimension): Boolean = (a & b) == b

  opaque type YGDirection = CUnsignedInt
  object YGDirection extends _BindgenEnumCUnsignedInt[YGDirection]:
    given _tag: Tag[YGDirection] = Tag.UInt
    inline def define(inline a: Long): YGDirection = a.toUInt
    val YGDirectionInherit = define(0)
    val YGDirectionLTR = define(1)
    val YGDirectionRTL = define(2)
    inline def getName(inline value: YGDirection): Option[String] =
      inline value match
        case YGDirectionInherit => Some("YGDirectionInherit")
        case YGDirectionLTR => Some("YGDirectionLTR")
        case YGDirectionRTL => Some("YGDirectionRTL")
        case _ => _root_.scala.None
    extension (a: YGDirection)
      inline def &(b: YGDirection): YGDirection = a & b
      inline def |(b: YGDirection): YGDirection = a | b
      inline def is(b: YGDirection): Boolean = (a & b) == b

  opaque type YGDisplay = CUnsignedInt
  object YGDisplay extends _BindgenEnumCUnsignedInt[YGDisplay]:
    given _tag: Tag[YGDisplay] = Tag.UInt
    inline def define(inline a: Long): YGDisplay = a.toUInt
    val YGDisplayFlex = define(0)
    val YGDisplayNone = define(1)
    val YGDisplayContents = define(2)
    inline def getName(inline value: YGDisplay): Option[String] =
      inline value match
        case YGDisplayFlex => Some("YGDisplayFlex")
        case YGDisplayNone => Some("YGDisplayNone")
        case YGDisplayContents => Some("YGDisplayContents")
        case _ => _root_.scala.None
    extension (a: YGDisplay)
      inline def &(b: YGDisplay): YGDisplay = a & b
      inline def |(b: YGDisplay): YGDisplay = a | b
      inline def is(b: YGDisplay): Boolean = (a & b) == b

  opaque type YGEdge = CUnsignedInt
  object YGEdge extends _BindgenEnumCUnsignedInt[YGEdge]:
    given _tag: Tag[YGEdge] = Tag.UInt
    inline def define(inline a: Long): YGEdge = a.toUInt
    val YGEdgeLeft = define(0)
    val YGEdgeTop = define(1)
    val YGEdgeRight = define(2)
    val YGEdgeBottom = define(3)
    val YGEdgeStart = define(4)
    val YGEdgeEnd = define(5)
    val YGEdgeHorizontal = define(6)
    val YGEdgeVertical = define(7)
    val YGEdgeAll = define(8)
    inline def getName(inline value: YGEdge): Option[String] =
      inline value match
        case YGEdgeLeft => Some("YGEdgeLeft")
        case YGEdgeTop => Some("YGEdgeTop")
        case YGEdgeRight => Some("YGEdgeRight")
        case YGEdgeBottom => Some("YGEdgeBottom")
        case YGEdgeStart => Some("YGEdgeStart")
        case YGEdgeEnd => Some("YGEdgeEnd")
        case YGEdgeHorizontal => Some("YGEdgeHorizontal")
        case YGEdgeVertical => Some("YGEdgeVertical")
        case YGEdgeAll => Some("YGEdgeAll")
        case _ => _root_.scala.None
    extension (a: YGEdge)
      inline def &(b: YGEdge): YGEdge = a & b
      inline def |(b: YGEdge): YGEdge = a | b
      inline def is(b: YGEdge): Boolean = (a & b) == b

  opaque type YGErrata = CUnsignedInt
  object YGErrata extends _BindgenEnumCUnsignedInt[YGErrata]:
    given _tag: Tag[YGErrata] = Tag.UInt
    inline def define(inline a: Long): YGErrata = a.toUInt
    val YGErrataNone = define(0)
    val YGErrataStretchFlexBasis = define(1)
    val YGErrataAbsolutePositionWithoutInsetsExcludesPadding = define(2)
    val YGErrataAbsolutePercentAgainstInnerSize = define(4)
    val YGErrataAll = define(2147483647)
    val YGErrataClassic = define(2147483646)
    inline def getName(inline value: YGErrata): Option[String] =
      inline value match
        case YGErrataNone => Some("YGErrataNone")
        case YGErrataStretchFlexBasis => Some("YGErrataStretchFlexBasis")
        case YGErrataAbsolutePositionWithoutInsetsExcludesPadding => Some("YGErrataAbsolutePositionWithoutInsetsExcludesPadding")
        case YGErrataAbsolutePercentAgainstInnerSize => Some("YGErrataAbsolutePercentAgainstInnerSize")
        case YGErrataAll => Some("YGErrataAll")
        case YGErrataClassic => Some("YGErrataClassic")
        case _ => _root_.scala.None
    extension (a: YGErrata)
      inline def &(b: YGErrata): YGErrata = a & b
      inline def |(b: YGErrata): YGErrata = a | b
      inline def is(b: YGErrata): Boolean = (a & b) == b

  opaque type YGExperimentalFeature = CUnsignedInt
  object YGExperimentalFeature extends _BindgenEnumCUnsignedInt[YGExperimentalFeature]:
    given _tag: Tag[YGExperimentalFeature] = Tag.UInt
    inline def define(inline a: Long): YGExperimentalFeature = a.toUInt
    val YGExperimentalFeatureWebFlexBasis = define(0)
    inline def getName(inline value: YGExperimentalFeature): Option[String] =
      inline value match
        case YGExperimentalFeatureWebFlexBasis => Some("YGExperimentalFeatureWebFlexBasis")
        case _ => _root_.scala.None
    extension (a: YGExperimentalFeature)
      inline def &(b: YGExperimentalFeature): YGExperimentalFeature = a & b
      inline def |(b: YGExperimentalFeature): YGExperimentalFeature = a | b
      inline def is(b: YGExperimentalFeature): Boolean = (a & b) == b

  opaque type YGFlexDirection = CUnsignedInt
  object YGFlexDirection extends _BindgenEnumCUnsignedInt[YGFlexDirection]:
    given _tag: Tag[YGFlexDirection] = Tag.UInt
    inline def define(inline a: Long): YGFlexDirection = a.toUInt
    val YGFlexDirectionColumn = define(0)
    val YGFlexDirectionColumnReverse = define(1)
    val YGFlexDirectionRow = define(2)
    val YGFlexDirectionRowReverse = define(3)
    inline def getName(inline value: YGFlexDirection): Option[String] =
      inline value match
        case YGFlexDirectionColumn => Some("YGFlexDirectionColumn")
        case YGFlexDirectionColumnReverse => Some("YGFlexDirectionColumnReverse")
        case YGFlexDirectionRow => Some("YGFlexDirectionRow")
        case YGFlexDirectionRowReverse => Some("YGFlexDirectionRowReverse")
        case _ => _root_.scala.None
    extension (a: YGFlexDirection)
      inline def &(b: YGFlexDirection): YGFlexDirection = a & b
      inline def |(b: YGFlexDirection): YGFlexDirection = a | b
      inline def is(b: YGFlexDirection): Boolean = (a & b) == b

  opaque type YGGutter = CUnsignedInt
  object YGGutter extends _BindgenEnumCUnsignedInt[YGGutter]:
    given _tag: Tag[YGGutter] = Tag.UInt
    inline def define(inline a: Long): YGGutter = a.toUInt
    val YGGutterColumn = define(0)
    val YGGutterRow = define(1)
    val YGGutterAll = define(2)
    inline def getName(inline value: YGGutter): Option[String] =
      inline value match
        case YGGutterColumn => Some("YGGutterColumn")
        case YGGutterRow => Some("YGGutterRow")
        case YGGutterAll => Some("YGGutterAll")
        case _ => _root_.scala.None
    extension (a: YGGutter)
      inline def &(b: YGGutter): YGGutter = a & b
      inline def |(b: YGGutter): YGGutter = a | b
      inline def is(b: YGGutter): Boolean = (a & b) == b

  opaque type YGJustify = CUnsignedInt
  object YGJustify extends _BindgenEnumCUnsignedInt[YGJustify]:
    given _tag: Tag[YGJustify] = Tag.UInt
    inline def define(inline a: Long): YGJustify = a.toUInt
    val YGJustifyFlexStart = define(0)
    val YGJustifyCenter = define(1)
    val YGJustifyFlexEnd = define(2)
    val YGJustifySpaceBetween = define(3)
    val YGJustifySpaceAround = define(4)
    val YGJustifySpaceEvenly = define(5)
    inline def getName(inline value: YGJustify): Option[String] =
      inline value match
        case YGJustifyFlexStart => Some("YGJustifyFlexStart")
        case YGJustifyCenter => Some("YGJustifyCenter")
        case YGJustifyFlexEnd => Some("YGJustifyFlexEnd")
        case YGJustifySpaceBetween => Some("YGJustifySpaceBetween")
        case YGJustifySpaceAround => Some("YGJustifySpaceAround")
        case YGJustifySpaceEvenly => Some("YGJustifySpaceEvenly")
        case _ => _root_.scala.None
    extension (a: YGJustify)
      inline def &(b: YGJustify): YGJustify = a & b
      inline def |(b: YGJustify): YGJustify = a | b
      inline def is(b: YGJustify): Boolean = (a & b) == b

  opaque type YGLogLevel = CUnsignedInt
  object YGLogLevel extends _BindgenEnumCUnsignedInt[YGLogLevel]:
    given _tag: Tag[YGLogLevel] = Tag.UInt
    inline def define(inline a: Long): YGLogLevel = a.toUInt
    val YGLogLevelError = define(0)
    val YGLogLevelWarn = define(1)
    val YGLogLevelInfo = define(2)
    val YGLogLevelDebug = define(3)
    val YGLogLevelVerbose = define(4)
    val YGLogLevelFatal = define(5)
    inline def getName(inline value: YGLogLevel): Option[String] =
      inline value match
        case YGLogLevelError => Some("YGLogLevelError")
        case YGLogLevelWarn => Some("YGLogLevelWarn")
        case YGLogLevelInfo => Some("YGLogLevelInfo")
        case YGLogLevelDebug => Some("YGLogLevelDebug")
        case YGLogLevelVerbose => Some("YGLogLevelVerbose")
        case YGLogLevelFatal => Some("YGLogLevelFatal")
        case _ => _root_.scala.None
    extension (a: YGLogLevel)
      inline def &(b: YGLogLevel): YGLogLevel = a & b
      inline def |(b: YGLogLevel): YGLogLevel = a | b
      inline def is(b: YGLogLevel): Boolean = (a & b) == b

  opaque type YGMeasureMode = CUnsignedInt
  object YGMeasureMode extends _BindgenEnumCUnsignedInt[YGMeasureMode]:
    given _tag: Tag[YGMeasureMode] = Tag.UInt
    inline def define(inline a: Long): YGMeasureMode = a.toUInt
    val YGMeasureModeUndefined = define(0)
    val YGMeasureModeExactly = define(1)
    val YGMeasureModeAtMost = define(2)
    inline def getName(inline value: YGMeasureMode): Option[String] =
      inline value match
        case YGMeasureModeUndefined => Some("YGMeasureModeUndefined")
        case YGMeasureModeExactly => Some("YGMeasureModeExactly")
        case YGMeasureModeAtMost => Some("YGMeasureModeAtMost")
        case _ => _root_.scala.None
    extension (a: YGMeasureMode)
      inline def &(b: YGMeasureMode): YGMeasureMode = a & b
      inline def |(b: YGMeasureMode): YGMeasureMode = a | b
      inline def is(b: YGMeasureMode): Boolean = (a & b) == b

  opaque type YGNodeType = CUnsignedInt
  object YGNodeType extends _BindgenEnumCUnsignedInt[YGNodeType]:
    given _tag: Tag[YGNodeType] = Tag.UInt
    inline def define(inline a: Long): YGNodeType = a.toUInt
    val YGNodeTypeDefault = define(0)
    val YGNodeTypeText = define(1)
    inline def getName(inline value: YGNodeType): Option[String] =
      inline value match
        case YGNodeTypeDefault => Some("YGNodeTypeDefault")
        case YGNodeTypeText => Some("YGNodeTypeText")
        case _ => _root_.scala.None
    extension (a: YGNodeType)
      inline def &(b: YGNodeType): YGNodeType = a & b
      inline def |(b: YGNodeType): YGNodeType = a | b
      inline def is(b: YGNodeType): Boolean = (a & b) == b

  opaque type YGOverflow = CUnsignedInt
  object YGOverflow extends _BindgenEnumCUnsignedInt[YGOverflow]:
    given _tag: Tag[YGOverflow] = Tag.UInt
    inline def define(inline a: Long): YGOverflow = a.toUInt
    val YGOverflowVisible = define(0)
    val YGOverflowHidden = define(1)
    val YGOverflowScroll = define(2)
    inline def getName(inline value: YGOverflow): Option[String] =
      inline value match
        case YGOverflowVisible => Some("YGOverflowVisible")
        case YGOverflowHidden => Some("YGOverflowHidden")
        case YGOverflowScroll => Some("YGOverflowScroll")
        case _ => _root_.scala.None
    extension (a: YGOverflow)
      inline def &(b: YGOverflow): YGOverflow = a & b
      inline def |(b: YGOverflow): YGOverflow = a | b
      inline def is(b: YGOverflow): Boolean = (a & b) == b

  opaque type YGPositionType = CUnsignedInt
  object YGPositionType extends _BindgenEnumCUnsignedInt[YGPositionType]:
    given _tag: Tag[YGPositionType] = Tag.UInt
    inline def define(inline a: Long): YGPositionType = a.toUInt
    val YGPositionTypeStatic = define(0)
    val YGPositionTypeRelative = define(1)
    val YGPositionTypeAbsolute = define(2)
    inline def getName(inline value: YGPositionType): Option[String] =
      inline value match
        case YGPositionTypeStatic => Some("YGPositionTypeStatic")
        case YGPositionTypeRelative => Some("YGPositionTypeRelative")
        case YGPositionTypeAbsolute => Some("YGPositionTypeAbsolute")
        case _ => _root_.scala.None
    extension (a: YGPositionType)
      inline def &(b: YGPositionType): YGPositionType = a & b
      inline def |(b: YGPositionType): YGPositionType = a | b
      inline def is(b: YGPositionType): Boolean = (a & b) == b

  opaque type YGUnit = CUnsignedInt
  object YGUnit extends _BindgenEnumCUnsignedInt[YGUnit]:
    given _tag: Tag[YGUnit] = Tag.UInt
    inline def define(inline a: Long): YGUnit = a.toUInt
    val YGUnitUndefined = define(0)
    val YGUnitPoint = define(1)
    val YGUnitPercent = define(2)
    val YGUnitAuto = define(3)
    inline def getName(inline value: YGUnit): Option[String] =
      inline value match
        case YGUnitUndefined => Some("YGUnitUndefined")
        case YGUnitPoint => Some("YGUnitPoint")
        case YGUnitPercent => Some("YGUnitPercent")
        case YGUnitAuto => Some("YGUnitAuto")
        case _ => _root_.scala.None
    extension (a: YGUnit)
      inline def &(b: YGUnit): YGUnit = a & b
      inline def |(b: YGUnit): YGUnit = a | b
      inline def is(b: YGUnit): Boolean = (a & b) == b

  opaque type YGWrap = CUnsignedInt
  object YGWrap extends _BindgenEnumCUnsignedInt[YGWrap]:
    given _tag: Tag[YGWrap] = Tag.UInt
    inline def define(inline a: Long): YGWrap = a.toUInt
    val YGWrapNoWrap = define(0)
    val YGWrapWrap = define(1)
    val YGWrapWrapReverse = define(2)
    inline def getName(inline value: YGWrap): Option[String] =
      inline value match
        case YGWrapNoWrap => Some("YGWrapNoWrap")
        case YGWrapWrap => Some("YGWrapWrap")
        case YGWrapWrapReverse => Some("YGWrapWrapReverse")
        case _ => _root_.scala.None
    extension (a: YGWrap)
      inline def &(b: YGWrap): YGWrap = a & b
      inline def |(b: YGWrap): YGWrap = a | b
      inline def is(b: YGWrap): Boolean = (a & b) == b

object aliases:
  import _root_.lib_yoga.enumerations.*
  import _root_.lib_yoga.predef.*
  import _root_.lib_yoga.aliases.*
  import _root_.lib_yoga.structs.*
  /**
   * Returns a defined offset to baseline (ascent).
  */
  opaque type YGBaselineFunc = CFuncPtr3[YGNodeConstRef, Float, Float, Float]
  object YGBaselineFunc: 
    given _tag: Tag[YGBaselineFunc] = Tag.materializeCFuncPtr3[YGNodeConstRef, Float, Float, Float]
    inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): YGBaselineFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(inline o: CFuncPtr3[YGNodeConstRef, Float, Float, Float]): YGBaselineFunc = o
    extension (v: YGBaselineFunc)
      inline def value: CFuncPtr3[YGNodeConstRef, Float, Float, Float] = v
      inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

  /**
   * Function pointer type for YGConfigSetCloneNodeFunc.
  */
  opaque type YGCloneNodeFunc = CFuncPtr3[YGNodeConstRef, YGNodeConstRef, size_t, YGNodeRef]
  object YGCloneNodeFunc: 
    given _tag: Tag[YGCloneNodeFunc] = Tag.materializeCFuncPtr3[YGNodeConstRef, YGNodeConstRef, size_t, YGNodeRef]
    inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): YGCloneNodeFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(inline o: CFuncPtr3[YGNodeConstRef, YGNodeConstRef, size_t, YGNodeRef]): YGCloneNodeFunc = o
    extension (v: YGCloneNodeFunc)
      inline def value: CFuncPtr3[YGNodeConstRef, YGNodeConstRef, size_t, YGNodeRef] = v
      inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

  /**
   * Handle to an immutable Yoga configuration.
  */
  opaque type YGConfigConstRef = Ptr[YGConfig]
  object YGConfigConstRef: 
    given _tag: Tag[YGConfigConstRef] = Tag.Ptr[YGConfig](YGConfig._tag)
    inline def apply(inline o: Ptr[YGConfig]): YGConfigConstRef = o
    extension (v: YGConfigConstRef)
      inline def value: Ptr[YGConfig] = v

  /**
   * Handle to a mutable Yoga configuration.
  */
  opaque type YGConfigRef = Ptr[YGConfig]
  object YGConfigRef: 
    given _tag: Tag[YGConfigRef] = Tag.Ptr[YGConfig](YGConfig._tag)
    inline def apply(inline o: Ptr[YGConfig]): YGConfigRef = o
    extension (v: YGConfigRef)
      inline def value: Ptr[YGConfig] = v

  opaque type YGDirtiedFunc = CFuncPtr1[YGNodeConstRef, Unit]
  object YGDirtiedFunc: 
    given _tag: Tag[YGDirtiedFunc] = Tag.materializeCFuncPtr1[YGNodeConstRef, Unit]
    inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): YGDirtiedFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(inline o: CFuncPtr1[YGNodeConstRef, Unit]): YGDirtiedFunc = o
    extension (v: YGDirtiedFunc)
      inline def value: CFuncPtr1[YGNodeConstRef, Unit] = v
      inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

  /**
   * Function pointer type for YGConfigSetLogger.
  */
  opaque type YGLogger = CFuncPtr5[YGConfigConstRef, YGNodeConstRef, YGLogLevel, CString, va_list, CInt]
  object YGLogger: 
    given _tag: Tag[YGLogger] = Tag.materializeCFuncPtr5[YGConfigConstRef, YGNodeConstRef, YGLogLevel, CString, va_list, CInt]
    inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): YGLogger = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(inline o: CFuncPtr5[YGConfigConstRef, YGNodeConstRef, YGLogLevel, CString, va_list, CInt]): YGLogger = o
    extension (v: YGLogger)
      inline def value: CFuncPtr5[YGConfigConstRef, YGNodeConstRef, YGLogLevel, CString, va_list, CInt] = v
      inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

  /**
   * Returns the computed dimensions of the node, following the constraints of `widthMode` and `heightMode`:
  */
  opaque type YGMeasureFunc = CFuncPtr5[YGNodeConstRef, Float, YGMeasureMode, Float, YGMeasureMode, YGSize]
  object YGMeasureFunc: 
    given _tag: Tag[YGMeasureFunc] = Tag.materializeCFuncPtr5[YGNodeConstRef, Float, YGMeasureMode, Float, YGMeasureMode, YGSize]
    inline def fromPtr(ptr: Ptr[Byte] | Ptr[?]): YGMeasureFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
    inline def apply(inline o: CFuncPtr5[YGNodeConstRef, Float, YGMeasureMode, Float, YGMeasureMode, YGSize]): YGMeasureFunc = o
    extension (v: YGMeasureFunc)
      inline def value: CFuncPtr5[YGNodeConstRef, Float, YGMeasureMode, Float, YGMeasureMode, YGSize] = v
      inline def toPtr: Ptr[?] = CFuncPtr.toPtr(v)

  /**
   * Handle to an immutable Yoga Node.
  */
  opaque type YGNodeConstRef = Ptr[YGNode]
  object YGNodeConstRef: 
    given _tag: Tag[YGNodeConstRef] = Tag.Ptr[YGNode](YGNode._tag)
    inline def apply(inline o: Ptr[YGNode]): YGNodeConstRef = o
    extension (v: YGNodeConstRef)
      inline def value: Ptr[YGNode] = v

  /**
   * Handle to a mutable Yoga Node.
  */
  opaque type YGNodeRef = Ptr[YGNode]
  object YGNodeRef: 
    given _tag: Tag[YGNodeRef] = Tag.Ptr[YGNode](YGNode._tag)
    inline def apply(inline o: Ptr[YGNode]): YGNodeRef = o
    extension (v: YGNodeRef)
      inline def value: Ptr[YGNode] = v

  type size_t = libc.stddef.size_t
  object size_t: 
    val _tag: Tag[size_t] = summon[Tag[libc.stddef.size_t]]
    inline def apply(inline o: libc.stddef.size_t): size_t = o
    extension (v: size_t)
      inline def value: libc.stddef.size_t = v

  type va_list = unsafe.CVarArgList
  object va_list: 
    val _tag: Tag[va_list] = summon[Tag[unsafe.CVarArgList]]
    inline def apply(inline o: unsafe.CVarArgList): va_list = o
    extension (v: va_list)
      inline def value: unsafe.CVarArgList = v

object structs:
  import _root_.lib_yoga.enumerations.*
  import _root_.lib_yoga.predef.*
  import _root_.lib_yoga.aliases.*
  import _root_.lib_yoga.structs.*
  opaque type YGConfig = CStruct0
  object YGConfig:
    given _tag: Tag[YGConfig] = Tag.materializeCStruct0Tag

  opaque type YGNode = CStruct0
  object YGNode:
    given _tag: Tag[YGNode] = Tag.materializeCStruct0Tag

  opaque type YGSize = CStruct2[Float, Float]
  object YGSize:
    given _tag: Tag[YGSize] = Tag.materializeCStruct2Tag[Float, Float]
    def apply()(using Zone): Ptr[YGSize] = scala.scalanative.unsafe.alloc[YGSize](1)
    def apply(width : Float, height : Float)(using Zone): Ptr[YGSize] = 
      val ____ptr = apply()
      (!____ptr).width = width
      (!____ptr).height = height
      ____ptr
    extension (struct: YGSize)
      def width : Float = struct._1
      def width_=(value: Float): Unit = !struct.at1 = value
      def height : Float = struct._2
      def height_=(value: Float): Unit = !struct.at2 = value

  /**
   * Structure used to represent a dimension in a style.
  */
  opaque type YGValue = CStruct2[Float, YGUnit]
  object YGValue:
    given _tag: Tag[YGValue] = Tag.materializeCStruct2Tag[Float, YGUnit]
    def apply()(using Zone): Ptr[YGValue] = scala.scalanative.unsafe.alloc[YGValue](1)
    def apply(value : Float, unit : YGUnit)(using Zone): Ptr[YGValue] = 
      val ____ptr = apply()
      (!____ptr).value = value
      (!____ptr).unit = unit
      ____ptr
    extension (struct: YGValue)
      def value : Float = struct._1
      def value_=(value: Float): Unit = !struct.at1 = value
      def unit : YGUnit = struct._2
      def unit_=(value: YGUnit): Unit = !struct.at2 = value


@extern
private[lib_yoga] object extern_functions:
  import _root_.lib_yoga.enumerations.*
  import _root_.lib_yoga.predef.*
  import _root_.lib_yoga.aliases.*
  import _root_.lib_yoga.structs.*
  def YGAlignToString(_0 : YGAlign): CString = extern

  def YGBoxSizingToString(_0 : YGBoxSizing): CString = extern

  /**
   * Frees the associated Yoga configuration.
  */
  def YGConfigFree(config : YGConfigRef): Unit = extern

  /**
   * Gets the currently set context.
  */
  def YGConfigGetContext(config : YGConfigConstRef): Ptr[Byte] = extern

  /**
   * Returns the default config values set by Yoga.
  */
  def YGConfigGetDefault(): YGConfigConstRef = extern

  /**
   * Get the currently set errata.
  */
  def YGConfigGetErrata(config : YGConfigConstRef): YGErrata = extern

  /**
   * Get the currently set point scale factor.
  */
  def YGConfigGetPointScaleFactor(config : YGConfigConstRef): Float = extern

  /**
   * Whether the configuration is set to use web defaults.
  */
  def YGConfigGetUseWebDefaults(config : YGConfigConstRef): Boolean = extern

  /**
   * Whether an experimental feature is set.
  */
  def YGConfigIsExperimentalFeatureEnabled(config : YGConfigConstRef, feature : YGExperimentalFeature): Boolean = extern

  /**
   * Allocates a set of configuration options. The configuration may be applied to multiple nodes (i.e. a single global config), or can be applied more granularly per-node.
  */
  def YGConfigNew(): YGConfigRef = extern

  /**
   * Sets a callback, called during layout, to create a new mutable Yoga node if Yoga must write to it and its owner is not its parent observed during layout.
  */
  def YGConfigSetCloneNodeFunc(config : YGConfigRef, callback : YGCloneNodeFunc): Unit = extern

  /**
   * Sets an arbitrary context pointer on the config which may be read from during callbacks.
  */
  def YGConfigSetContext(config : YGConfigRef, context : Ptr[Byte]): Unit = extern

  /**
   * Configures how Yoga balances W3C conformance vs compatibility with layouts created against earlier versions of Yoga.
  */
  def YGConfigSetErrata(config : YGConfigRef, errata : YGErrata): Unit = extern

  /**
   * Enable an experimental/unsupported feature in Yoga.
  */
  def YGConfigSetExperimentalFeatureEnabled(config : YGConfigRef, feature : YGExperimentalFeature, enabled : Boolean): Unit = extern

  /**
   * Set a custom log function for to use when logging diagnostics or fatal. errors.
  */
  def YGConfigSetLogger(config : YGConfigRef, logger : YGLogger): Unit = extern

  /**
   * Yoga will by default round final layout positions and dimensions to the nearst point. `pointScaleFactor` controls the density of the grid used for layout rounding (e.g. to round to the closest display pixel).
  */
  def YGConfigSetPointScaleFactor(config : YGConfigRef, pixelsInPoint : Float): Unit = extern

  /**
   * Yoga by default creates new nodes with style defaults different from flexbox on web (e.g. `YGFlexDirectionColumn` and `YGPositionRelative`). `UseWebDefaults` instructs Yoga to instead use a default style consistent with the web.
  */
  def YGConfigSetUseWebDefaults(config : YGConfigRef, enabled : Boolean): Unit = extern

  def YGDimensionToString(_0 : YGDimension): CString = extern

  def YGDirectionToString(_0 : YGDirection): CString = extern

  def YGDisplayToString(_0 : YGDisplay): CString = extern

  def YGEdgeToString(_0 : YGEdge): CString = extern

  def YGErrataToString(_0 : YGErrata): CString = extern

  def YGExperimentalFeatureToString(_0 : YGExperimentalFeature): CString = extern

  def YGFlexDirectionToString(_0 : YGFlexDirection): CString = extern

  /**
   * Whether a dimension represented as a float is defined.
  */
  def YGFloatIsUndefined(value : Float): Boolean = extern

  def YGGutterToString(_0 : YGGutter): CString = extern

  def YGJustifyToString(_0 : YGJustify): CString = extern

  def YGLogLevelToString(_0 : YGLogLevel): CString = extern

  def YGMeasureModeToString(_0 : YGMeasureMode): CString = extern

  /**
   * Calculates the layout of the tree rooted at the given node.
  */
  def YGNodeCalculateLayout(node : YGNodeRef, availableWidth : Float, availableHeight : Float, ownerDirection : YGDirection): Unit = extern

  def YGNodeCanUseCachedMeasurement(widthMode : YGMeasureMode, availableWidth : Float, heightMode : YGMeasureMode, availableHeight : Float, lastWidthMode : YGMeasureMode, lastAvailableWidth : Float, lastHeightMode : YGMeasureMode, lastAvailableHeight : Float, lastComputedWidth : Float, lastComputedHeight : Float, marginRow : Float, marginColumn : Float, config : YGConfigRef): Boolean = extern

  /**
   * Returns a mutable copy of an existing node, with the same context and children, but no owner set. Does not call the function set by YGConfigSetCloneNodeFunc().
  */
  def YGNodeClone(node : YGNodeConstRef): YGNodeRef = extern

  def YGNodeCopyStyle(dstNode : YGNodeRef, srcNode : YGNodeConstRef): Unit = extern

  /**
   * Frees the Yoga node without disconnecting it from its owner or children. Allows garbage collecting Yoga nodes in parallel when the entire tree is unreachable.
  */
  def YGNodeFinalize(node : YGNodeRef): Unit = extern

  /**
   * Frees the Yoga node, disconnecting it from its owner and children.
  */
  def YGNodeFree(node : YGNodeRef): Unit = extern

  /**
   * Frees the subtree of Yoga nodes rooted at the given node.
  */
  def YGNodeFreeRecursive(node : YGNodeRef): Unit = extern

  /**
   * Whether the node will always form a containing block for any descendant. This can happen in situation where the client implements something like a transform that can affect containing blocks but is not handled by Yoga directly.
  */
  def YGNodeGetAlwaysFormsContainingBlock(node : YGNodeConstRef): Boolean = extern

  /**
   * Get the child node at a given index.
  */
  def YGNodeGetChild(node : YGNodeRef, index : size_t): YGNodeRef = extern

  /**
   * The number of child nodes.
  */
  def YGNodeGetChildCount(node : YGNodeConstRef): size_t = extern

  /**
   * Get the config currently set on the node.
  */
  def YGNodeGetConfig(node : YGNodeRef): YGConfigConstRef = extern

  /**
   * Returns the context or NULL if no context has been set.
  */
  def YGNodeGetContext(node : YGNodeConstRef): Ptr[Byte] = extern

  /**
   * Returns a dirtied func if set.
  */
  def YGNodeGetDirtiedFunc(node : YGNodeConstRef): YGDirtiedFunc = extern

  /**
   * Whether the given node may have new layout results. Must be reset by calling YGNodeSetHasNewLayout().
  */
  def YGNodeGetHasNewLayout(node : YGNodeConstRef): Boolean = extern

  /**
   * Wwhether a leaf node's layout results may be truncated during layout rounding.
  */
  def YGNodeGetNodeType(node : YGNodeConstRef): YGNodeType = extern

  /**
   * Get the parent/owner currently set for a node.
  */
  def YGNodeGetOwner(node : YGNodeRef): YGNodeRef = extern

  /**
   * Get the parent/owner currently set for a node.
  */
  def YGNodeGetParent(node : YGNodeRef): YGNodeRef = extern

  /**
   * Whether a baseline function is set.
  */
  def YGNodeHasBaselineFunc(node : YGNodeConstRef): Boolean = extern

  /**
   * Whether a measure function is set.
  */
  def YGNodeHasMeasureFunc(node : YGNodeConstRef): Boolean = extern

  /**
   * Inserts a child node at the given index.
  */
  def YGNodeInsertChild(node : YGNodeRef, child : YGNodeRef, index : size_t): Unit = extern

  /**
   * Whether the node's layout results are dirty due to it or its children changing.
  */
  def YGNodeIsDirty(node : YGNodeConstRef): Boolean = extern

  /**
   * Whether this node is set as the reference baseline.
  */
  def YGNodeIsReferenceBaseline(node : YGNodeConstRef): Boolean = extern

  def YGNodeLayoutGetBorder(node : YGNodeConstRef, edge : YGEdge): Float = extern

  def YGNodeLayoutGetBottom(node : YGNodeConstRef): Float = extern

  def YGNodeLayoutGetDirection(node : YGNodeConstRef): YGDirection = extern

  def YGNodeLayoutGetHadOverflow(node : YGNodeConstRef): Boolean = extern

  def YGNodeLayoutGetHeight(node : YGNodeConstRef): Float = extern

  def YGNodeLayoutGetLeft(node : YGNodeConstRef): Float = extern

  def YGNodeLayoutGetMargin(node : YGNodeConstRef, edge : YGEdge): Float = extern

  def YGNodeLayoutGetPadding(node : YGNodeConstRef, edge : YGEdge): Float = extern

  def YGNodeLayoutGetRight(node : YGNodeConstRef): Float = extern

  def YGNodeLayoutGetTop(node : YGNodeConstRef): Float = extern

  def YGNodeLayoutGetWidth(node : YGNodeConstRef): Float = extern

  /**
   * Marks a node with custom measure function as dirty.
  */
  def YGNodeMarkDirty(node : YGNodeRef): Unit = extern

  /**
   * Heap allocates and returns a new Yoga node using Yoga settings.
  */
  def YGNodeNew(): YGNodeRef = extern

  /**
   * Heap allocates and returns a new Yoga node, with customized settings.
  */
  def YGNodeNewWithConfig(config : YGConfigConstRef): YGNodeRef = extern

  /**
   * Removes all children nodes.
  */
  def YGNodeRemoveAllChildren(node : YGNodeRef): Unit = extern

  /**
   * Removes the given child node.
  */
  def YGNodeRemoveChild(node : YGNodeRef, child : YGNodeRef): Unit = extern

  /**
   * Resets the node to its default state.
  */
  def YGNodeReset(node : YGNodeRef): Unit = extern

  /**
   * Make it so that this node will always form a containing block for any descendant nodes. This is useful for when a node has a property outside of of Yoga that will form a containing block. For example, transforms or some of the others listed in https://developer.mozilla.org/en-US/docs/Web/CSS/Containing_block
  */
  def YGNodeSetAlwaysFormsContainingBlock(node : YGNodeRef, alwaysFormsContainingBlock : Boolean): Unit = extern

  /**
   * Set a custom function for determining the text baseline for use in baseline alignment.
  */
  def YGNodeSetBaselineFunc(node : YGNodeRef, baselineFunc : YGBaselineFunc): Unit = extern

  /**
   * Sets children according to the given list of nodes.
  */
  def YGNodeSetChildren(owner : YGNodeRef, children : Ptr[YGNodeRef], count : size_t): Unit = extern

  /**
   * Set a new config for the node after creation.
  */
  def YGNodeSetConfig(node : YGNodeRef, config : YGConfigRef): Unit = extern

  /**
   * Sets extra data on the Yoga node which may be read from during callbacks.
  */
  def YGNodeSetContext(node : YGNodeRef, context : Ptr[Byte]): Unit = extern

  /**
   * Called when a change is made to the Yoga tree which dirties this node.
  */
  def YGNodeSetDirtiedFunc(node : YGNodeRef, dirtiedFunc : YGDirtiedFunc): Unit = extern

  /**
   * Sets whether a nodes layout is considered new.
  */
  def YGNodeSetHasNewLayout(node : YGNodeRef, hasNewLayout : Boolean): Unit = extern

  /**
   * Sets this node should be considered the reference baseline among siblings.
  */
  def YGNodeSetIsReferenceBaseline(node : YGNodeRef, isReferenceBaseline : Boolean): Unit = extern

  /**
   * Allows providing custom measurements for a Yoga leaf node (usually for measuring text). YGNodeMarkDirty() must be set if content effecting the measurements of the node changes.
  */
  def YGNodeSetMeasureFunc(node : YGNodeRef, measureFunc : YGMeasureFunc): Unit = extern

  /**
   * Sets whether a leaf node's layout results may be truncated during layout rounding.
  */
  def YGNodeSetNodeType(node : YGNodeRef, nodeType : YGNodeType): Unit = extern

  def YGNodeStyleGetAlignContent(node : YGNodeConstRef): YGAlign = extern

  def YGNodeStyleGetAlignItems(node : YGNodeConstRef): YGAlign = extern

  def YGNodeStyleGetAlignSelf(node : YGNodeConstRef): YGAlign = extern

  def YGNodeStyleGetAspectRatio(node : YGNodeConstRef): Float = extern

  def YGNodeStyleGetBorder(node : YGNodeConstRef, edge : YGEdge): Float = extern

  def YGNodeStyleGetBoxSizing(node : YGNodeConstRef): YGBoxSizing = extern

  def YGNodeStyleGetDirection(node : YGNodeConstRef): YGDirection = extern

  def YGNodeStyleGetDisplay(node : YGNodeConstRef): YGDisplay = extern

  def YGNodeStyleGetFlex(node : YGNodeConstRef): Float = extern

  def YGNodeStyleGetFlexDirection(node : YGNodeConstRef): YGFlexDirection = extern

  def YGNodeStyleGetFlexGrow(node : YGNodeConstRef): Float = extern

  def YGNodeStyleGetFlexShrink(node : YGNodeConstRef): Float = extern

  def YGNodeStyleGetFlexWrap(node : YGNodeConstRef): YGWrap = extern

  def YGNodeStyleGetGap(node : YGNodeConstRef, gutter : YGGutter): Float = extern

  def YGNodeStyleGetJustifyContent(node : YGNodeConstRef): YGJustify = extern

  def YGNodeStyleGetOverflow(node : YGNodeConstRef): YGOverflow = extern

  def YGNodeStyleGetPositionType(node : YGNodeConstRef): YGPositionType = extern

  def YGNodeStyleSetAlignContent(node : YGNodeRef, alignContent : YGAlign): Unit = extern

  def YGNodeStyleSetAlignItems(node : YGNodeRef, alignItems : YGAlign): Unit = extern

  def YGNodeStyleSetAlignSelf(node : YGNodeRef, alignSelf : YGAlign): Unit = extern

  def YGNodeStyleSetAspectRatio(node : YGNodeRef, aspectRatio : Float): Unit = extern

  def YGNodeStyleSetBorder(node : YGNodeRef, edge : YGEdge, border : Float): Unit = extern

  def YGNodeStyleSetBoxSizing(node : YGNodeRef, boxSizing : YGBoxSizing): Unit = extern

  def YGNodeStyleSetDirection(node : YGNodeRef, direction : YGDirection): Unit = extern

  def YGNodeStyleSetDisplay(node : YGNodeRef, display : YGDisplay): Unit = extern

  def YGNodeStyleSetFlex(node : YGNodeRef, flex : Float): Unit = extern

  def YGNodeStyleSetFlexBasis(node : YGNodeRef, flexBasis : Float): Unit = extern

  def YGNodeStyleSetFlexBasisAuto(node : YGNodeRef): Unit = extern

  def YGNodeStyleSetFlexBasisPercent(node : YGNodeRef, flexBasis : Float): Unit = extern

  def YGNodeStyleSetFlexDirection(node : YGNodeRef, flexDirection : YGFlexDirection): Unit = extern

  def YGNodeStyleSetFlexGrow(node : YGNodeRef, flexGrow : Float): Unit = extern

  def YGNodeStyleSetFlexShrink(node : YGNodeRef, flexShrink : Float): Unit = extern

  def YGNodeStyleSetFlexWrap(node : YGNodeRef, flexWrap : YGWrap): Unit = extern

  def YGNodeStyleSetGap(node : YGNodeRef, gutter : YGGutter, gapLength : Float): Unit = extern

  def YGNodeStyleSetGapPercent(node : YGNodeRef, gutter : YGGutter, gapLength : Float): Unit = extern

  def YGNodeStyleSetHeight(node : YGNodeRef, height : Float): Unit = extern

  def YGNodeStyleSetHeightAuto(node : YGNodeRef): Unit = extern

  def YGNodeStyleSetHeightPercent(node : YGNodeRef, height : Float): Unit = extern

  def YGNodeStyleSetJustifyContent(node : YGNodeRef, justifyContent : YGJustify): Unit = extern

  def YGNodeStyleSetMargin(node : YGNodeRef, edge : YGEdge, margin : Float): Unit = extern

  def YGNodeStyleSetMarginAuto(node : YGNodeRef, edge : YGEdge): Unit = extern

  def YGNodeStyleSetMarginPercent(node : YGNodeRef, edge : YGEdge, margin : Float): Unit = extern

  def YGNodeStyleSetMaxHeight(node : YGNodeRef, maxHeight : Float): Unit = extern

  def YGNodeStyleSetMaxHeightPercent(node : YGNodeRef, maxHeight : Float): Unit = extern

  def YGNodeStyleSetMaxWidth(node : YGNodeRef, maxWidth : Float): Unit = extern

  def YGNodeStyleSetMaxWidthPercent(node : YGNodeRef, maxWidth : Float): Unit = extern

  def YGNodeStyleSetMinHeight(node : YGNodeRef, minHeight : Float): Unit = extern

  def YGNodeStyleSetMinHeightPercent(node : YGNodeRef, minHeight : Float): Unit = extern

  def YGNodeStyleSetMinWidth(node : YGNodeRef, minWidth : Float): Unit = extern

  def YGNodeStyleSetMinWidthPercent(node : YGNodeRef, minWidth : Float): Unit = extern

  def YGNodeStyleSetOverflow(node : YGNodeRef, overflow : YGOverflow): Unit = extern

  def YGNodeStyleSetPadding(node : YGNodeRef, edge : YGEdge, padding : Float): Unit = extern

  def YGNodeStyleSetPaddingPercent(node : YGNodeRef, edge : YGEdge, padding : Float): Unit = extern

  def YGNodeStyleSetPosition(node : YGNodeRef, edge : YGEdge, position : Float): Unit = extern

  def YGNodeStyleSetPositionAuto(node : YGNodeRef, edge : YGEdge): Unit = extern

  def YGNodeStyleSetPositionPercent(node : YGNodeRef, edge : YGEdge, position : Float): Unit = extern

  def YGNodeStyleSetPositionType(node : YGNodeRef, positionType : YGPositionType): Unit = extern

  def YGNodeStyleSetWidth(node : YGNodeRef, width : Float): Unit = extern

  def YGNodeStyleSetWidthAuto(node : YGNodeRef): Unit = extern

  def YGNodeStyleSetWidthPercent(node : YGNodeRef, width : Float): Unit = extern

  /**
   * Replaces the child node at a given index with a new one.
  */
  def YGNodeSwapChild(node : YGNodeRef, child : YGNodeRef, index : size_t): Unit = extern

  def YGNodeTypeToString(_0 : YGNodeType): CString = extern

  def YGOverflowToString(_0 : YGOverflow): CString = extern

  def YGPositionTypeToString(_0 : YGPositionType): CString = extern

  /**
   * Rounds a point value to the nearest whole pixel, given a pointScaleFactor describing pixel density.
  */
  def YGRoundValueToPixelGrid(value : Double, pointScaleFactor : Double, forceCeil : Boolean, forceFloor : Boolean): Float = extern

  def YGUnitToString(_0 : YGUnit): CString = extern

  def YGWrapToString(_0 : YGWrap): CString = extern

  private[lib_yoga] def __sn_wrap_lib_yoga_YGNodeStyleGetFlexBasis(node : YGNodeConstRef, __return : Ptr[YGValue]): Unit = extern

  private[lib_yoga] def __sn_wrap_lib_yoga_YGNodeStyleGetHeight(node : YGNodeConstRef, __return : Ptr[YGValue]): Unit = extern

  private[lib_yoga] def __sn_wrap_lib_yoga_YGNodeStyleGetMargin(node : YGNodeConstRef, edge : YGEdge, __return : Ptr[YGValue]): Unit = extern

  private[lib_yoga] def __sn_wrap_lib_yoga_YGNodeStyleGetMaxHeight(node : YGNodeConstRef, __return : Ptr[YGValue]): Unit = extern

  private[lib_yoga] def __sn_wrap_lib_yoga_YGNodeStyleGetMaxWidth(node : YGNodeConstRef, __return : Ptr[YGValue]): Unit = extern

  private[lib_yoga] def __sn_wrap_lib_yoga_YGNodeStyleGetMinHeight(node : YGNodeConstRef, __return : Ptr[YGValue]): Unit = extern

  private[lib_yoga] def __sn_wrap_lib_yoga_YGNodeStyleGetMinWidth(node : YGNodeConstRef, __return : Ptr[YGValue]): Unit = extern

  private[lib_yoga] def __sn_wrap_lib_yoga_YGNodeStyleGetPadding(node : YGNodeConstRef, edge : YGEdge, __return : Ptr[YGValue]): Unit = extern

  private[lib_yoga] def __sn_wrap_lib_yoga_YGNodeStyleGetPosition(node : YGNodeConstRef, edge : YGEdge, __return : Ptr[YGValue]): Unit = extern

  private[lib_yoga] def __sn_wrap_lib_yoga_YGNodeStyleGetWidth(node : YGNodeConstRef, __return : Ptr[YGValue]): Unit = extern


object functions:
  import _root_.lib_yoga.enumerations.*
  import _root_.lib_yoga.predef.*
  import _root_.lib_yoga.aliases.*
  import _root_.lib_yoga.structs.*
  import extern_functions.*
  export extern_functions.*

  def YGNodeStyleGetFlexBasis(node : YGNodeConstRef)(using Zone): YGValue = 
    val __ptr_0: Ptr[YGValue] = alloc[YGValue](1)
    __sn_wrap_lib_yoga_YGNodeStyleGetFlexBasis(node, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  def YGNodeStyleGetFlexBasis(node : YGNodeConstRef)(__return : Ptr[YGValue]): Unit = 
    __sn_wrap_lib_yoga_YGNodeStyleGetFlexBasis(node, __return)

  def YGNodeStyleGetHeight(node : YGNodeConstRef)(__return : Ptr[YGValue]): Unit = 
    __sn_wrap_lib_yoga_YGNodeStyleGetHeight(node, __return)

  def YGNodeStyleGetHeight(node : YGNodeConstRef)(using Zone): YGValue = 
    val __ptr_0: Ptr[YGValue] = alloc[YGValue](1)
    __sn_wrap_lib_yoga_YGNodeStyleGetHeight(node, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  def YGNodeStyleGetMargin(node : YGNodeConstRef, edge : YGEdge)(using Zone): YGValue = 
    val __ptr_0: Ptr[YGValue] = alloc[YGValue](1)
    __sn_wrap_lib_yoga_YGNodeStyleGetMargin(node, edge, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  def YGNodeStyleGetMargin(node : YGNodeConstRef, edge : YGEdge)(__return : Ptr[YGValue]): Unit = 
    __sn_wrap_lib_yoga_YGNodeStyleGetMargin(node, edge, __return)

  def YGNodeStyleGetMaxHeight(node : YGNodeConstRef)(using Zone): YGValue = 
    val __ptr_0: Ptr[YGValue] = alloc[YGValue](1)
    __sn_wrap_lib_yoga_YGNodeStyleGetMaxHeight(node, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  def YGNodeStyleGetMaxHeight(node : YGNodeConstRef)(__return : Ptr[YGValue]): Unit = 
    __sn_wrap_lib_yoga_YGNodeStyleGetMaxHeight(node, __return)

  def YGNodeStyleGetMaxWidth(node : YGNodeConstRef)(__return : Ptr[YGValue]): Unit = 
    __sn_wrap_lib_yoga_YGNodeStyleGetMaxWidth(node, __return)

  def YGNodeStyleGetMaxWidth(node : YGNodeConstRef)(using Zone): YGValue = 
    val __ptr_0: Ptr[YGValue] = alloc[YGValue](1)
    __sn_wrap_lib_yoga_YGNodeStyleGetMaxWidth(node, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  def YGNodeStyleGetMinHeight(node : YGNodeConstRef)(__return : Ptr[YGValue]): Unit = 
    __sn_wrap_lib_yoga_YGNodeStyleGetMinHeight(node, __return)

  def YGNodeStyleGetMinHeight(node : YGNodeConstRef)(using Zone): YGValue = 
    val __ptr_0: Ptr[YGValue] = alloc[YGValue](1)
    __sn_wrap_lib_yoga_YGNodeStyleGetMinHeight(node, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  def YGNodeStyleGetMinWidth(node : YGNodeConstRef)(using Zone): YGValue = 
    val __ptr_0: Ptr[YGValue] = alloc[YGValue](1)
    __sn_wrap_lib_yoga_YGNodeStyleGetMinWidth(node, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  def YGNodeStyleGetMinWidth(node : YGNodeConstRef)(__return : Ptr[YGValue]): Unit = 
    __sn_wrap_lib_yoga_YGNodeStyleGetMinWidth(node, __return)

  def YGNodeStyleGetPadding(node : YGNodeConstRef, edge : YGEdge)(using Zone): YGValue = 
    val __ptr_0: Ptr[YGValue] = alloc[YGValue](1)
    __sn_wrap_lib_yoga_YGNodeStyleGetPadding(node, edge, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  def YGNodeStyleGetPadding(node : YGNodeConstRef, edge : YGEdge)(__return : Ptr[YGValue]): Unit = 
    __sn_wrap_lib_yoga_YGNodeStyleGetPadding(node, edge, __return)

  def YGNodeStyleGetPosition(node : YGNodeConstRef, edge : YGEdge)(__return : Ptr[YGValue]): Unit = 
    __sn_wrap_lib_yoga_YGNodeStyleGetPosition(node, edge, __return)

  def YGNodeStyleGetPosition(node : YGNodeConstRef, edge : YGEdge)(using Zone): YGValue = 
    val __ptr_0: Ptr[YGValue] = alloc[YGValue](1)
    __sn_wrap_lib_yoga_YGNodeStyleGetPosition(node, edge, (__ptr_0 + 0))
    !(__ptr_0 + 0)

  def YGNodeStyleGetWidth(node : YGNodeConstRef)(__return : Ptr[YGValue]): Unit = 
    __sn_wrap_lib_yoga_YGNodeStyleGetWidth(node, __return)

  def YGNodeStyleGetWidth(node : YGNodeConstRef)(using Zone): YGValue = 
    val __ptr_0: Ptr[YGValue] = alloc[YGValue](1)
    __sn_wrap_lib_yoga_YGNodeStyleGetWidth(node, (__ptr_0 + 0))
    !(__ptr_0 + 0)

object types:
  export _root_.lib_yoga.structs.*
  export _root_.lib_yoga.aliases.*
  export _root_.lib_yoga.enumerations.*

object all:
  export _root_.lib_yoga.enumerations.YGAlign
  export _root_.lib_yoga.enumerations.YGBoxSizing
  export _root_.lib_yoga.enumerations.YGDimension
  export _root_.lib_yoga.enumerations.YGDirection
  export _root_.lib_yoga.enumerations.YGDisplay
  export _root_.lib_yoga.enumerations.YGEdge
  export _root_.lib_yoga.enumerations.YGErrata
  export _root_.lib_yoga.enumerations.YGExperimentalFeature
  export _root_.lib_yoga.enumerations.YGFlexDirection
  export _root_.lib_yoga.enumerations.YGGutter
  export _root_.lib_yoga.enumerations.YGJustify
  export _root_.lib_yoga.enumerations.YGLogLevel
  export _root_.lib_yoga.enumerations.YGMeasureMode
  export _root_.lib_yoga.enumerations.YGNodeType
  export _root_.lib_yoga.enumerations.YGOverflow
  export _root_.lib_yoga.enumerations.YGPositionType
  export _root_.lib_yoga.enumerations.YGUnit
  export _root_.lib_yoga.enumerations.YGWrap
  export _root_.lib_yoga.aliases.YGBaselineFunc
  export _root_.lib_yoga.aliases.YGCloneNodeFunc
  export _root_.lib_yoga.aliases.YGConfigConstRef
  export _root_.lib_yoga.aliases.YGConfigRef
  export _root_.lib_yoga.aliases.YGDirtiedFunc
  export _root_.lib_yoga.aliases.YGLogger
  export _root_.lib_yoga.aliases.YGMeasureFunc
  export _root_.lib_yoga.aliases.YGNodeConstRef
  export _root_.lib_yoga.aliases.YGNodeRef
  export _root_.lib_yoga.aliases.size_t
  export _root_.lib_yoga.aliases.va_list
  export _root_.lib_yoga.structs.YGConfig
  export _root_.lib_yoga.structs.YGNode
  export _root_.lib_yoga.structs.YGSize
  export _root_.lib_yoga.structs.YGValue
  export _root_.lib_yoga.functions.YGAlignToString
  export _root_.lib_yoga.functions.YGBoxSizingToString
  export _root_.lib_yoga.functions.YGConfigFree
  export _root_.lib_yoga.functions.YGConfigGetContext
  export _root_.lib_yoga.functions.YGConfigGetDefault
  export _root_.lib_yoga.functions.YGConfigGetErrata
  export _root_.lib_yoga.functions.YGConfigGetPointScaleFactor
  export _root_.lib_yoga.functions.YGConfigGetUseWebDefaults
  export _root_.lib_yoga.functions.YGConfigIsExperimentalFeatureEnabled
  export _root_.lib_yoga.functions.YGConfigNew
  export _root_.lib_yoga.functions.YGConfigSetCloneNodeFunc
  export _root_.lib_yoga.functions.YGConfigSetContext
  export _root_.lib_yoga.functions.YGConfigSetErrata
  export _root_.lib_yoga.functions.YGConfigSetExperimentalFeatureEnabled
  export _root_.lib_yoga.functions.YGConfigSetLogger
  export _root_.lib_yoga.functions.YGConfigSetPointScaleFactor
  export _root_.lib_yoga.functions.YGConfigSetUseWebDefaults
  export _root_.lib_yoga.functions.YGDimensionToString
  export _root_.lib_yoga.functions.YGDirectionToString
  export _root_.lib_yoga.functions.YGDisplayToString
  export _root_.lib_yoga.functions.YGEdgeToString
  export _root_.lib_yoga.functions.YGErrataToString
  export _root_.lib_yoga.functions.YGExperimentalFeatureToString
  export _root_.lib_yoga.functions.YGFlexDirectionToString
  export _root_.lib_yoga.functions.YGFloatIsUndefined
  export _root_.lib_yoga.functions.YGGutterToString
  export _root_.lib_yoga.functions.YGJustifyToString
  export _root_.lib_yoga.functions.YGLogLevelToString
  export _root_.lib_yoga.functions.YGMeasureModeToString
  export _root_.lib_yoga.functions.YGNodeCalculateLayout
  export _root_.lib_yoga.functions.YGNodeCanUseCachedMeasurement
  export _root_.lib_yoga.functions.YGNodeClone
  export _root_.lib_yoga.functions.YGNodeCopyStyle
  export _root_.lib_yoga.functions.YGNodeFinalize
  export _root_.lib_yoga.functions.YGNodeFree
  export _root_.lib_yoga.functions.YGNodeFreeRecursive
  export _root_.lib_yoga.functions.YGNodeGetAlwaysFormsContainingBlock
  export _root_.lib_yoga.functions.YGNodeGetChild
  export _root_.lib_yoga.functions.YGNodeGetChildCount
  export _root_.lib_yoga.functions.YGNodeGetConfig
  export _root_.lib_yoga.functions.YGNodeGetContext
  export _root_.lib_yoga.functions.YGNodeGetDirtiedFunc
  export _root_.lib_yoga.functions.YGNodeGetHasNewLayout
  export _root_.lib_yoga.functions.YGNodeGetNodeType
  export _root_.lib_yoga.functions.YGNodeGetOwner
  export _root_.lib_yoga.functions.YGNodeGetParent
  export _root_.lib_yoga.functions.YGNodeHasBaselineFunc
  export _root_.lib_yoga.functions.YGNodeHasMeasureFunc
  export _root_.lib_yoga.functions.YGNodeInsertChild
  export _root_.lib_yoga.functions.YGNodeIsDirty
  export _root_.lib_yoga.functions.YGNodeIsReferenceBaseline
  export _root_.lib_yoga.functions.YGNodeLayoutGetBorder
  export _root_.lib_yoga.functions.YGNodeLayoutGetBottom
  export _root_.lib_yoga.functions.YGNodeLayoutGetDirection
  export _root_.lib_yoga.functions.YGNodeLayoutGetHadOverflow
  export _root_.lib_yoga.functions.YGNodeLayoutGetHeight
  export _root_.lib_yoga.functions.YGNodeLayoutGetLeft
  export _root_.lib_yoga.functions.YGNodeLayoutGetMargin
  export _root_.lib_yoga.functions.YGNodeLayoutGetPadding
  export _root_.lib_yoga.functions.YGNodeLayoutGetRight
  export _root_.lib_yoga.functions.YGNodeLayoutGetTop
  export _root_.lib_yoga.functions.YGNodeLayoutGetWidth
  export _root_.lib_yoga.functions.YGNodeMarkDirty
  export _root_.lib_yoga.functions.YGNodeNew
  export _root_.lib_yoga.functions.YGNodeNewWithConfig
  export _root_.lib_yoga.functions.YGNodeRemoveAllChildren
  export _root_.lib_yoga.functions.YGNodeRemoveChild
  export _root_.lib_yoga.functions.YGNodeReset
  export _root_.lib_yoga.functions.YGNodeSetAlwaysFormsContainingBlock
  export _root_.lib_yoga.functions.YGNodeSetBaselineFunc
  export _root_.lib_yoga.functions.YGNodeSetChildren
  export _root_.lib_yoga.functions.YGNodeSetConfig
  export _root_.lib_yoga.functions.YGNodeSetContext
  export _root_.lib_yoga.functions.YGNodeSetDirtiedFunc
  export _root_.lib_yoga.functions.YGNodeSetHasNewLayout
  export _root_.lib_yoga.functions.YGNodeSetIsReferenceBaseline
  export _root_.lib_yoga.functions.YGNodeSetMeasureFunc
  export _root_.lib_yoga.functions.YGNodeSetNodeType
  export _root_.lib_yoga.functions.YGNodeStyleGetAlignContent
  export _root_.lib_yoga.functions.YGNodeStyleGetAlignItems
  export _root_.lib_yoga.functions.YGNodeStyleGetAlignSelf
  export _root_.lib_yoga.functions.YGNodeStyleGetAspectRatio
  export _root_.lib_yoga.functions.YGNodeStyleGetBorder
  export _root_.lib_yoga.functions.YGNodeStyleGetBoxSizing
  export _root_.lib_yoga.functions.YGNodeStyleGetDirection
  export _root_.lib_yoga.functions.YGNodeStyleGetDisplay
  export _root_.lib_yoga.functions.YGNodeStyleGetFlex
  export _root_.lib_yoga.functions.YGNodeStyleGetFlexDirection
  export _root_.lib_yoga.functions.YGNodeStyleGetFlexGrow
  export _root_.lib_yoga.functions.YGNodeStyleGetFlexShrink
  export _root_.lib_yoga.functions.YGNodeStyleGetFlexWrap
  export _root_.lib_yoga.functions.YGNodeStyleGetGap
  export _root_.lib_yoga.functions.YGNodeStyleGetJustifyContent
  export _root_.lib_yoga.functions.YGNodeStyleGetOverflow
  export _root_.lib_yoga.functions.YGNodeStyleGetPositionType
  export _root_.lib_yoga.functions.YGNodeStyleSetAlignContent
  export _root_.lib_yoga.functions.YGNodeStyleSetAlignItems
  export _root_.lib_yoga.functions.YGNodeStyleSetAlignSelf
  export _root_.lib_yoga.functions.YGNodeStyleSetAspectRatio
  export _root_.lib_yoga.functions.YGNodeStyleSetBorder
  export _root_.lib_yoga.functions.YGNodeStyleSetBoxSizing
  export _root_.lib_yoga.functions.YGNodeStyleSetDirection
  export _root_.lib_yoga.functions.YGNodeStyleSetDisplay
  export _root_.lib_yoga.functions.YGNodeStyleSetFlex
  export _root_.lib_yoga.functions.YGNodeStyleSetFlexBasis
  export _root_.lib_yoga.functions.YGNodeStyleSetFlexBasisAuto
  export _root_.lib_yoga.functions.YGNodeStyleSetFlexBasisPercent
  export _root_.lib_yoga.functions.YGNodeStyleSetFlexDirection
  export _root_.lib_yoga.functions.YGNodeStyleSetFlexGrow
  export _root_.lib_yoga.functions.YGNodeStyleSetFlexShrink
  export _root_.lib_yoga.functions.YGNodeStyleSetFlexWrap
  export _root_.lib_yoga.functions.YGNodeStyleSetGap
  export _root_.lib_yoga.functions.YGNodeStyleSetGapPercent
  export _root_.lib_yoga.functions.YGNodeStyleSetHeight
  export _root_.lib_yoga.functions.YGNodeStyleSetHeightAuto
  export _root_.lib_yoga.functions.YGNodeStyleSetHeightPercent
  export _root_.lib_yoga.functions.YGNodeStyleSetJustifyContent
  export _root_.lib_yoga.functions.YGNodeStyleSetMargin
  export _root_.lib_yoga.functions.YGNodeStyleSetMarginAuto
  export _root_.lib_yoga.functions.YGNodeStyleSetMarginPercent
  export _root_.lib_yoga.functions.YGNodeStyleSetMaxHeight
  export _root_.lib_yoga.functions.YGNodeStyleSetMaxHeightPercent
  export _root_.lib_yoga.functions.YGNodeStyleSetMaxWidth
  export _root_.lib_yoga.functions.YGNodeStyleSetMaxWidthPercent
  export _root_.lib_yoga.functions.YGNodeStyleSetMinHeight
  export _root_.lib_yoga.functions.YGNodeStyleSetMinHeightPercent
  export _root_.lib_yoga.functions.YGNodeStyleSetMinWidth
  export _root_.lib_yoga.functions.YGNodeStyleSetMinWidthPercent
  export _root_.lib_yoga.functions.YGNodeStyleSetOverflow
  export _root_.lib_yoga.functions.YGNodeStyleSetPadding
  export _root_.lib_yoga.functions.YGNodeStyleSetPaddingPercent
  export _root_.lib_yoga.functions.YGNodeStyleSetPosition
  export _root_.lib_yoga.functions.YGNodeStyleSetPositionAuto
  export _root_.lib_yoga.functions.YGNodeStyleSetPositionPercent
  export _root_.lib_yoga.functions.YGNodeStyleSetPositionType
  export _root_.lib_yoga.functions.YGNodeStyleSetWidth
  export _root_.lib_yoga.functions.YGNodeStyleSetWidthAuto
  export _root_.lib_yoga.functions.YGNodeStyleSetWidthPercent
  export _root_.lib_yoga.functions.YGNodeSwapChild
  export _root_.lib_yoga.functions.YGNodeTypeToString
  export _root_.lib_yoga.functions.YGOverflowToString
  export _root_.lib_yoga.functions.YGPositionTypeToString
  export _root_.lib_yoga.functions.YGRoundValueToPixelGrid
  export _root_.lib_yoga.functions.YGUnitToString
  export _root_.lib_yoga.functions.YGWrapToString
  export _root_.lib_yoga.functions.YGNodeStyleGetFlexBasis
  export _root_.lib_yoga.functions.YGNodeStyleGetHeight
  export _root_.lib_yoga.functions.YGNodeStyleGetMargin
  export _root_.lib_yoga.functions.YGNodeStyleGetMaxHeight
  export _root_.lib_yoga.functions.YGNodeStyleGetMaxWidth
  export _root_.lib_yoga.functions.YGNodeStyleGetMinHeight
  export _root_.lib_yoga.functions.YGNodeStyleGetMinWidth
  export _root_.lib_yoga.functions.YGNodeStyleGetPadding
  export _root_.lib_yoga.functions.YGNodeStyleGetPosition
  export _root_.lib_yoga.functions.YGNodeStyleGetWidth