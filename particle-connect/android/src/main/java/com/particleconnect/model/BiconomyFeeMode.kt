package com.particleconnect.model

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import com.particle.base.data.FeeQuote
import com.particle.base.data.FeeQuotesResult

@Keep
data class BiconomyFeeMode(
  @SerializedName("option") val option: String,
  @SerializedName("fee_quote") val feeQuote: FeeQuote?,
  @SerializedName("whole_fee_quote") val wholeFeeQuote: FeeQuotesResult,
  @SerializedName("token_paymaster_address") val tokenPaymasterAddress: String?
)

@Keep
data class TransactionParams(
  @SerializedName("transaction") val transaction: String,
  @SerializedName("fee_mode") val feeMode: BiconomyFeeMode?,
  @SerializedName("public_address") val publicAddress: String,
  @SerializedName("wallet_type") val walletType: String,

  )

