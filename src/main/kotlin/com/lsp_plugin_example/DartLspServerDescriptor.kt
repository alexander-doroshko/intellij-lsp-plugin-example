package com.lsp_plugin_example

import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.platform.lsp.api.ProjectWideLspServerDescriptor

class DartLspServerDescriptor(project: Project) : ProjectWideLspServerDescriptor(project, "Dart") {
  override fun isSupportedFile(file: VirtualFile): Boolean = file.extension == "dart"
  override fun createCommandLine(): GeneralCommandLine = GeneralCommandLine("dart", "language-server")
}
