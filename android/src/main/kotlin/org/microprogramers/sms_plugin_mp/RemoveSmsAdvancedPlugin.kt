package org.microprogramers.sms_plugin_mp
//
//import androidx.annotation.NonNull
//import org.microprogramers.sms_plugin_mp.permisions.Permissions
//import org.microprogramers.sms_plugin_mp.status.SmsStateHandler
//
//import io.flutter.embedding.engine.plugins.FlutterPlugin
//import io.flutter.plugin.common.*
//import io.flutter.plugin.common.MethodChannel.MethodCallHandler
//import io.flutter.plugin.common.MethodChannel.Result
//
//
//private const val CHANNEL_RECV = "plugins.microprogramers.org/recvSMS"
//private const val CHANNEL_SMS_STATUS = "plugins.microprogramers.org/statusSMS"
//private const val CHANNEL_SEND = "plugins.microprogramers.org/sendSMS"
//private const val CHANNEL_QUER = "plugins.microprogramers.org/querySMS"
//private const val CHANNEL_QUER_CONT = "plugins.microprogramers.org/queryContact"
//private const val CHANNEL_QUER_CONT_PHOTO = "plugins.microprogramers.org/queryContactPhoto"
//private const val CHANNEL_USER_PROFILE = "plugins.microprogramers.org/userProfile"
//private const val CHANNEL_SIM_CARDS = "plugins.microprogramers.org/simCards"
//private const val CHANNEL_REMOVE = "microprogramers.sms.remove.channel"
//
///** SmsAdvancedPlugin */
//class RemoveSmsAdvancedPlugin {
//
//  /**
//   * Plugin registration.
//   */
//  fun registerWith(registrar: PluginRegistry.Registrar) {
//    registrar.addRequestPermissionsResultListener(Permissions.Companion.requestsResultsListener)
//
//    // SMS remover
//    val smsRemover = SmsRemover(registrar)
//    val removeSmsChannel = MethodChannel(registrar.messenger(), CHANNEL_REMOVE)
//    removeSmsChannel.setMethodCallHandler(smsRemover)
//
//    // SMS receiver
//    val receiver = SmsReceiver(registrar)
//    val receiveSmsChannel = EventChannel(
//      registrar.messenger(),
//      CHANNEL_RECV, JSONMethodCodec.INSTANCE
//    )
//    receiveSmsChannel.setStreamHandler(receiver)
//
//    // SMS status receiver
//    EventChannel(registrar.messenger(), CHANNEL_SMS_STATUS, JSONMethodCodec.INSTANCE)
//      .setStreamHandler(SmsStateHandler(registrar))
//
//    /// SMS sender
//    val sender = SmsSender(registrar)
//    val sendSmsChannel = MethodChannel(
//      registrar.messenger(),
//      CHANNEL_SEND, JSONMethodCodec.INSTANCE
//    )
//    sendSmsChannel.setMethodCallHandler(sender)
//
//    /// SMS query
//    val query = SmsQuery(registrar)
//    val querySmsChannel =
//      MethodChannel(registrar.messenger(), CHANNEL_QUER, JSONMethodCodec.INSTANCE)
//    querySmsChannel.setMethodCallHandler(query)
//
//    /// Contact query
//    val contactQuery = ContactQuery(registrar)
//    val queryContactChannel =
//      MethodChannel(registrar.messenger(), CHANNEL_QUER_CONT, JSONMethodCodec.INSTANCE)
//    queryContactChannel.setMethodCallHandler(contactQuery)
//
//    /// Contact Photo query
//    val contactPhotoQuery = ContactPhotoQuery(registrar)
//    val queryContactPhotoChannel = MethodChannel(
//      registrar.messenger(),
//      CHANNEL_QUER_CONT_PHOTO,
//      StandardMethodCodec.INSTANCE
//    )
//    queryContactPhotoChannel.setMethodCallHandler(contactPhotoQuery)
//
//    /// User Profile
//    val userProfileProvider = UserProfileProvider(registrar)
//    val userProfileProviderChannel =
//      MethodChannel(registrar.messenger(), CHANNEL_USER_PROFILE, JSONMethodCodec.INSTANCE)
//    userProfileProviderChannel.setMethodCallHandler(userProfileProvider)
//
//    //Sim Cards Provider
//    MethodChannel(registrar.messenger(), CHANNEL_SIM_CARDS, JSONMethodCodec.INSTANCE)
//      .setMethodCallHandler(SimCardsProvider(registrar))
//  }
//}
