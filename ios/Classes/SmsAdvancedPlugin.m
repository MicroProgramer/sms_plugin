#import "SmsAdvancedPlugin.h"
#if __has_include(<sms_plugin_mp/sms_plugin_mp-Swift.h>)
#import <sms_plugin_mp/sms_plugin_mp-Swift.h>
#else
// Support project import fallback if the generated compatibility header
// is not copied when this plugin is created as a library.
// https://forums.swift.org/t/swift-static-libraries-dont-copy-generated-objective-c-header/19816
#import "sms_plugin_mp-Swift.h"
#endif

@implementation SmsAdvancedPlugin
+ (void)registerWithRegistrar:(NSObject<FlutterPluginRegistrar>*)registrar {
  [SmsAdvancedPlugin registerWithRegistrar:registrar];
}
@end
