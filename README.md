# Utils
android utils

* [How to use](#howtouse)
* [Components](#components)
    * [AppUtil](#apputil)
        * [getAppName](#getappname)
        * [getVersionName](#getversionname)
        * [getVersionCode](#getversioncode)
    * [BitmapUtil](#BitmapUtil)
        * [drawableToBitmap](#drawableToBitmap)
    * [ColorsUtil](#ColorsUtil)
    * [ColorUtil](#ColorUtil)
        * [colorBurn](#colorBurn)
    * [DateUtil](#DateUtil)
        * [str2Date](#str2Date)
        * [str2Date](#str2Date2)
        * [str2Calendar](#str2Calendar)
        * [str2Calendar](#str2Calendar2)
        * [date2Str](#date2Str)
        * [date2Str](#date2Str2)
        * [date2Str](#date2Str3)
        * [getCurDateStr](#getCurDateStr)
        * [getCurDateStr](#getCurDateStr2)
        * [getMillon](#getMillon)
        * [getDay](#getDay)
        * [getSMillon](#getSMillon)
        * [addMonth](#addMonth)
        * [addDay](#addDay)
        * [getNextHour](#getNextHour)
        * [getTimeString](#getTimeString)
        * [getMonth](#getMonth)
        * [getDay](#getDay)
        * [getHour](#getHour)
        * [getMinute](#getMinute)
        * [getDatePattern](#getDatePattern)
        * [getSecond](#getSecond)
        * [parse](#parse)
        * [parse](#parse2)
        * [getMillis](#getMillis)
        * [countDays](#countDays)
        * [countDays](#countDays)
    * [DensityUtil](#DensityUtil)
        * [dp2px](#dp2px)
        * [sp2px](#sp2px)
        * [px2dp](#px2dp)
        * [px2sp](#px2sp)
    * [ExitActivityUtil](#ExitActivityUtil)
        * [onKeyDown](#onKeyDown)
    * [FileUtil](#FileUtil)
        * [mkFile](#mkFile)
        * [mkDir](#mkDir)
        * [delFile](#delFile)
        * [delDir](#delDir)
        * [copy](#copy)
        * [move](#move)
        * [getDiskCacheDir](#getDiskCacheDir)
    * [LogUtil](#LogUtil)
    * [NetUtil](#NetUtil)
        * [isConnected](#isConnected)
        * [isWIFI](#isWIFI)
        * [openSetting](#openSetting)
    * [PhoneUtil](#PhoneUtil)
        * [sendMessage](#sendMessage)
        * [getImei](#getImei)
        * [isFastDoubleClick](#isFastDoubleClick)
        * [getMobileModel](#getMobileModel)
        * [getMobileBrand](#getMobileBrand)
        * [toTakePhoto](#toTakePhoto)
        * [toTakePicture](#toTakePicture)
    * [ScreenUtil](#ScreenUtil)
        * [getScreenWidth](#getScreenWidth)
        * [getScreenHeight](#getScreenHeight)
        * [getStatusHeight](#getStatusHeight)
        * [snapShotWithStatusBar](#snapShotWithStatusBar)
        * [snapShotWithoutStatusBar](#snapShotWithoutStatusBar)
    * [SDCardUtil](#SDCardUtil)
        * [isSDCardEnable](#isSDCardEnable)
        * [getSDCardPath](#getSDCardPath)
        * [getSDCardAllSize](#getSDCardAllSize)
        * [getFreeBytes](#getFreeBytes)
        * [getRootDirectoryPath](#getRootDirectoryPath)
    * [ShortCutUtil](#ShortCutUtil)
        * [hasShortcut](#hasShortcut)
        * [addShortcut](#addShortcut)
        * [delShortcut](#delShortcut)
    * [SPUtil](#SPUtil)
        * [put](#put)
        * [get](#get)
        * [remove](#remove)
        * [clear](#clear)
        * [contains](#contains)
        * [getAll](#getAll)
    * [StringUtil](#StringUtil)
        * [isBlank](#isBlank)
        * [isEmpty](#isEmpty)
        * [isEmpty](#isEmpty2)
        * [isNotEmpty](#isNotEmpty)
        * [filterEmpty](#filterEmpty)
        * [replace](#replace)
        * [split](#split)
        * [length](#length)
        * [countLength](#countLength)
        * [nullStrToEmpty](#nullStrToEmpty)
        * [capitalizeFirstLetter](#capitalizeFirstLetter)
        * [utf8Encode](#utf8Encode)
        * [getHrefInnerHtml](#getHrefInnerHtml)
        * [htmlEscapeCharsToString](#htmlEscapeCharsToString)
        * [fullWidthToHalfWidth](#fullWidthToHalfWidth)
        * [halfWidthToFullWidth](#halfWidthToFullWidth)
        * [replaceBlanktihuan](#replaceBlanktihuan)
        * [getChars](#getChars)
        * [isAllDigital](#isAllDigital)
        * [removeChar](#removeChar)
        * [removeChar](#removeChar2)
        * [removeChar](#removeChar3)
        * [filterBlank](#filterBlank)
        * [toLowerCase](#toLowerCase)
        * [toUpperCase](#toUpperCase)
        * [firstLetterToLowerCase](#firstLetterToLowerCase)
        * [firstLetterToUpperCase](#firstLetterToUpperCase)
        * [MD5](#MD5)
        * [startsWithIgnoreCase](#startsWithIgnoreCase)
        * [endsWithIgnoreCase](#endsWithIgnoreCase)
        * [checkLength](#checkLength)
        * [checkLength](#checkLength2)
    * [ToastUtil](#ToastUtil)
        * [showShort](#showShort)
        * [showShort](#showShort2)
        * [showLong](#showLong)
        * [showLong](#showLong2)
        * [show](#show)
        * [show](#show2)



##Howtouse

If you want use this library, you only have to download Utils project, import it into your workspace and add the project as a library in your android project settings.

If you prefer it, you can use the gradle dependency, you have to add these lines in your build.gradle file:

```xml
Step 1. Add the JitPack repository to your build file
repositories {
    jcenter()
    maven { url "https://jitpack.io" }

}

Step 2. Add the dependency
dependencies {
    compile 'com.github.seventhrui:Utils:1.1.1'
    //or
    //compile 'com.github.seventhrui:Utils:+'
}
```

##Components
####AppUtil
######getAppName
```xml
获取应用名称
```
######getVersionName
```xml
获取版本名称
```
######getVersionCode
```xml
获取版本号
```
```xml
