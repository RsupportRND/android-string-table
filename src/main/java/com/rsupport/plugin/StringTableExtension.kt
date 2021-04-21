package com.rsupport.plugin

import org.gradle.api.Project
import org.gradle.api.provider.Property

open class StringTableExtension(project: Project) {

    var googleDriveCredentialPath: Property<String> = project.objects.property(String::class.java)
    var outputXlsxFilePath: Property<String> = project.objects.property(String::class.java)
    var spreadSheetFieldId: Property<String> = project.objects.property(String::class.java)
    var androidResourcePath: Property<String> = project.objects.property(String::class.java)
    var inputSheetName: Property<String> = project.objects.property(String::class.java)
    var indexRowNumber: Property<Int> = project.objects.property(Int::class.java)

    fun setGoogleDriveCredentialPath(googleDriveCredentialPath: String?) {
        this.googleDriveCredentialPath.set(googleDriveCredentialPath)
    }

    fun setSpreadSheetFieldId(spreadSheetFieldId: String) {
        this.spreadSheetFieldId.set(spreadSheetFieldId)
    }

    fun setOutputXlsxFilePath(outputXlsxFilePath: String) {
        this.outputXlsxFilePath.set(outputXlsxFilePath)
    }

    fun setAndroidResourcePath(androidResourcePath: String) {
        this.androidResourcePath.set(androidResourcePath)
    }

    fun setInputSheetName(inputSheetName: String) {
        this.inputSheetName.set(inputSheetName)
    }

    fun setIndexRowNumber(indexRowNumber: Int) {
        this.indexRowNumber.set(indexRowNumber)
    }

    fun getGoogleDriveCredentialPath(): String = googleDriveCredentialPath.get()

    fun getSpreadSheetFieldId(): String = spreadSheetFieldId.get()

    fun getOutputXlsxFilePath(): String = outputXlsxFilePath.get()

    fun getAndroidResourcePath(): String = androidResourcePath.get()

    fun getInputSheetName(): String = inputSheetName.get()

    fun getIndexRowNumber(): Int = indexRowNumber.get()
}