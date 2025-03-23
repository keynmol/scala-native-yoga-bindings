## Yoga bindings for Scala 3 Native

[Yoga](https://www.yogalayout.dev/) is a layout engine.

Here's an example which creates a root container and two children (with margins), and 
lays them out similar to have flexbox in CSS would. At the end of layouting we get the actual physical positions and dimensions of
child nodes, which you can then use with some graphics library.

If you have [sn-vcpkg] and [scala-cli] installed, you can try running the example with:

```
sn-vcpkg scala-cli yoga -- run *.scala -M helloYoga
```

Here's the code:

```scala
import lib_yoga.all.*
import scalanative.{unsigned, libc}, unsigned.*, libc.math.NAN

extension (yg: YGNodeRef) inline def const = yg.asInstanceOf[YGNodeConstRef]

@main def helloYoga =
  val root = YGNodeNew()
  YGNodeStyleSetFlexDirection(root, YGFlexDirection.YGFlexDirectionRow)
  YGNodeStyleSetWidth(root, 100.0f)
  YGNodeStyleSetHeight(root, 100.0f)

  val child0 = YGNodeNew()
  YGNodeStyleSetFlexGrow(child0, 1.0f)
  YGNodeStyleSetMargin(child0, YGEdge.YGEdgeRight, 10.0f)
  YGNodeInsertChild(root, child0, 0.toUSize)

  val child1 = YGNodeNew()
  YGNodeStyleSetFlexGrow(child1, 1.0f)
  YGNodeInsertChild(root, child1, 1.toUSize)

  YGNodeCalculateLayout(root, NAN, NAN, YGDirection.YGDirectionLTR)

  val left = YGNodeLayoutGetLeft(child0.const)
  val height = YGNodeLayoutGetHeight(child0.const)

  println(s"child0 Left: $left")
  println(s"child0 Height: $height")
  println(s"child1 left: ${YGNodeLayoutGetLeft(child1.const)}")
  println(s"child2 left: ${YGNodeLayoutGetHeight(child1.const)}")
```
