# Utils
android utils

* [How to use](#howtouse)
* [Components](#components)
    * [AppUtil](#apputil)
        * [getAppName](#getappname)
        * [getVersionName](#getversionname)
        * [getVersionCode](#getversioncode)
    * [BitmapUtil](#bitmaputil)
        * [drawableToBitmap](#drawabletobitmap)
    * [ColorsUtil](#colorsutil)
    * [ColorUtil](#colorutil)
        * [colorBurn](#colorburn)
    * [DateUtil](#dateutil)
        * [str2Date](#str2date)
        * [str2Date](#str2date2)
        * [str2Calendar](#str2calendar)
        * [str2Calendar](#str2calendar2)
        * [date2Str](#date2str)
        * [date2Str](#date2str2)
        * [date2Str](#date2str3)
        * [getCurDateStr](#getcurdateStr)
        * [getCurDateStr](#getcurdateStr2)
        * [getMillon](#getmillon)
        * [getDay](#getday)
        * [getSMillon](#getsmillon)
        * [addMonth](#addmonth)
        * [addDay](#addday)
        * [getNextHour](#getnexthour)
        * [getTimeString](#gettimestring)
        * [getMonth](#getmonth)
        * [getDay](#getday)
        * [getHour](#gethour)
        * [getMinute](#getminute)
        * [getDatePattern](#getdatepattern)
        * [getSecond](#getsecond)
        * [parse](#parse)
        * [parse](#parse2)
        * [getMillis](#getmillis)
        * [countDays](#countdays)
        * [countDays](#countdays)
    * [DensityUtil](#densityutil)
        * [dp2px](#dp2px)
        * [sp2px](#sp2px)
        * [px2dp](#px2dp)
        * [px2sp](#px2sp)
    * [ExitActivityUtil](#exitactivityutil)
        * [onKeyDown](#onkeydown)
    * [FileUtil](#fileutil)
        * [mkFile](#mkfile)
        * [mkDir](#mkdir)
        * [delFile](#delfile)
        * [delDir](#deldir)
        * [copy](#copy)
        * [move](#move)
        * [getDiskCacheDir](#getdiskcachedir)
    * [LogUtil](#logutil)
    * [NetUtil](#netutil)
        * [isConnected](#isconnected)
        * [isWIFI](#iswifi)
        * [openSetting](#opensetting)
    * [PhoneUtil](#phoneutil)
        * [sendMessage](#sendmessage)
        * [getImei](#getimei)
        * [isFastDoubleClick](#isfastdoubleclick)
        * [getMobileModel](#getmobilemodel)
        * [getMobileBrand](#getmobilebrand)
        * [toTakePhoto](#totakephoto)
        * [toTakePicture](#totakepicture)
    * [ScreenUtil](#screenutil)
        * [getScreenWidth](#getscreenwidth)
        * [getScreenHeight](#getscreenheight)
        * [getStatusHeight](#getstatusheight)
        * [snapShotWithStatusBar](#snapshotwithstatusbar)
        * [snapShotWithoutStatusBar](#snapshotwithoutstatusbar)
    * [SDCardUtil](#sdcardutil)
        * [isSDCardEnable](#issdcardenable)
        * [getSDCardPath](#getsdcardpath)
        * [getSDCardAllSize](#getsdcardallsize)
        * [getFreeBytes](#getfreebytes)
        * [getRootDirectoryPath](#getrootdirectorypath)
    * [ShortCutUtil](#shortcututil)
        * [hasShortcut](#hasshortcut)
        * [addShortcut](#addshortcut)
        * [delShortcut](#delshortcut)
    * [SPUtil](#sputil)
        * [put](#put)
        * [get](#get)
        * [remove](#remove)
        * [clear](#clear)
        * [contains](#contains)
        * [getAll](#getAll)
    * [StringUtil](#stringutil)
        * [isBlank](#isblank)
        * [isEmpty](#isempty)
        * [isEmpty](#isempty2)
        * [isNotEmpty](#isnotempty)
        * [filterEmpty](#filterempty)
        * [replace](#replace)
        * [split](#split)
        * [length](#length)
        * [countLength](#countlength)
        * [nullStrToEmpty](#nullstrtoempty)
        * [capitalizeFirstLetter](#capitalizefirstletter)
        * [utf8Encode](#utf8encode)
        * [getHrefInnerHtml](#gethrefinnerhtml)
        * [htmlEscapeCharsToString](#htmlescapecharstostring)
        * [fullWidthToHalfWidth](#fullwidthtohalfwidth)
        * [halfWidthToFullWidth](#halfwidthtofullwidth)
        * [replaceBlanktihuan](#replaceblanktihuan)
        * [getChars](#getchars)
        * [isAllDigital](#isalldigital)
        * [removeChar](#removechar)
        * [removeChar](#removechar2)
        * [removeChar](#removechar3)
        * [filterBlank](#filterblank)
        * [toLowerCase](#tolowercase)
        * [toUpperCase](#touppercase)
        * [firstLetterToLowerCase](#firstlettertolowercase)
        * [firstLetterToUpperCase](#firstlettertouppercase)
        * [MD5](#md5)
        * [startsWithIgnoreCase](#startswithignorecase)
        * [endsWithIgnoreCase](#endswithignorecase)
        * [checkLength](#checklength)
        * [checkLength](#checklength2)
    * [ToastUtil](#toastutil)
        * [showShort](#showshort)
        * [showShort](#showshort2)
        * [showLong](#showlong)
        * [showLong](#showlong2)
        * [show](#show)
        * [show](#show2)



##Howtouse

If you want use this library, you only have to download Utils project, import it into your workspace and add the project as a library in your android project settings.

If you prefer it, you can use the gradle dependency, you have to add these lines in your build.gradle file:


>Step 1. Add the JitPack repository to your build file
```xml
repositories {
    jcenter()
    maven { url "https://jitpack.io" }
>}
```

>Step 2. Add the dependency
```xml
dependencies {
    compile 'com.github.seventhrui:Utils:1.1.1'
    //or
    //compile 'com.github.seventhrui:Utils:+'
>}
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
