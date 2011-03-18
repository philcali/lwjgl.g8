A [giter8] template for starting off development using sbt / Scala / [LWJGL]

## Usage

These instructions assume you have heard, and correctly installed n8han's [conscript]
and giter8 tools. Once you have that, starting a new lwjgl project is made quite simple with
the following commands:

    g8 philcali/lwjgl.g8
    # Answer questions apropriately
    cd lwjgl-project
    sbt update run
    
If everything worked, you should be greeted with a 640 x 480 *breather* window!

[conscript]: https://github.com/n8han/conscript#readme
[giter8]: https://github.com/n8han/giter8#readme
[LWJGL]: http://lwjgl.org
