package com.lsp_plugin_example

import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.platform.lsp.api.LspServer
import com.intellij.platform.lsp.api.LspServerSupportProvider
import com.intellij.platform.lsp.api.LspServerSupportProvider.LspServerStarter
import com.intellij.platform.lsp.api.lsWidget.LspServerWidgetItem

class DartLspServerSupportProvider : LspServerSupportProvider {
  override fun fileOpened(project: Project, file: VirtualFile, serverStarter: LspServerStarter) {
    if (file.extension == "dart") {
      serverStarter.ensureServerStarted(DartLspServerDescriptor(project))
    }
  }

  override fun createLspServerWidgetItem(lspServer: LspServer, currentFile: VirtualFile?): LspServerWidgetItem? =
    LspServerWidgetItem(lspServer, currentFile, icon = DartIcons.Dart, settingsPageClass = null)
}
