# gradle-multiproject-test project

This project is just a test of gradles multi-project feature.

In here I also made two custom shadow jar tasks, which create jar files that contain all the submodules of a specified category (e.g. api).

### Building

I also made a task "all" in the rootProject in the build group that executes both custom tasks.

### Content

The java classes contained in this project are really just a test of the dependencies and don't make sense as a standalone project.