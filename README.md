### IntelliJ LSP Plugin Example
<!-- Plugin description -->
This is a plugin for IntelliJ-based IDEs that demonstrates the usage of the
[LSP API](https://plugins.jetbrains.com/docs/intellij/language-server-protocol.html)
<!-- Plugin description end -->
### IntelliJ LSP API Source Code

Make sure you have LSP API source code available, it contains useful documentation and examples
- Use `Navigate | Class...` to open the `com.intellij.platform.lsp.api.LspServerDescriptor` class
- If you only see the decompiled code in the opened editor, click `Download IntelliJ Platform sources`

### Plugin Description
The plugin integrates the Dart LSP server

- The plugin assumes that the [Dart SDK](https://dart.dev/get-dart) is already installed
- The `dart` executable, which is located in the `dart-sdk/bin` directory, should be available from the command line.
  You may need to add `.../dart-sdk/bin` to the system's `PATH` environment variable
