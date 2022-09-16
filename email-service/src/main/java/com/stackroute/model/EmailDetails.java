package com.stackroute.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public class EmailDetails {

        // Class data members
        private String emailId;
        private String msgBody;
        private String subject;
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		public String getMsgBody() {
			return msgBody;
		}
		public void setMsgBody(String msgBody) {
			this.msgBody = msgBody;
		}
		public String getSubject() {
			return subject;
		}
		public void setSubject(String subject) {
			this.subject = subject;
		}
        
        

    }


