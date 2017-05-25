package org.bigbluebutton.api2.meeting

import org.bigbluebutton.common2.messages.MeetingCreatedEvtMsg

trait FromAkkaAppsHandlersTrait {
  def handleMeetingCreatedEvtMsg(msg: MeetingCreatedEvtMsg): Unit = {
    println("************* HANDLING " + msg.header.name)
  }
}
