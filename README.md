A [Giter8][g8] template for a Chrome extension powered by Scala.js.

## Usage

If you have SBT version 0.13.13 or later, you can simply run:

```
g8 VEINHORN/chrome-extension.g8
```

> Attention:
> SBT `new` command doesn't support conditions in Giter8 templates, that's why you should use Giter8 command line tool for grabbing this template.

It will ask you several questions (name, package and which version of Scala.js bindings for Chrome to use) and then create a new directory.

### Scala.js bindings for Chrome

If you prefer to use SBT 1.1.0 and the latest Scala.js version you can set `scalajs_chrome_050` option to `no` (it will use modified for SBT 1.1.0 version of [scala-js-chrome](https://github.com/lucidd/scala-js-chrome) bindings from [sbt-1.1.0](https://github.com/VEINHORN/scala-js-chrome/tree/sbt-1.1.0) branch), or just set it to `yes` and use current stable version of [scala-js-chrome](https://github.com/lucidd/scala-js-chrome) bindings.

Template license
----------------
Written in 2018 by Boris Korogvich

To the extent possible under law, the author(s) have dedicated all copyright and related
and neighboring rights to this template to the public domain worldwide.
This template is distributed without any warranty. See <http://creativecommons.org/publicdomain/zero/1.0/>.

[g8]: http://www.foundweekends.org/giter8/
