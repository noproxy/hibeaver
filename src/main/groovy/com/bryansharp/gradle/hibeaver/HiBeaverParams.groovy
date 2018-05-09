package com.bryansharp.gradle.hibeaver

import com.bryansharp.gradle.hibeaver.utils.ModifyClassUtil
import org.objectweb.asm.ClassVisitor

public class HiBeaverParams {
    String hiBeaverModifyName = ''
    boolean enableModify = true
    boolean watchTimeConsume = false
    boolean keepQuiet = false
    boolean showHelp = true
    Map<String, Object> modifyMatchMaps = [:]
    Map<String, Map<String, Object>> modifyTasks = [:]
    Class<ModifyClassUtil.MethodFilterClassVisitor> replaceClassVisitor = null

}