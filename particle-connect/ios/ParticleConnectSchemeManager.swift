//
//  SchemeManager.swift
//  reactnativeparticle
//
//  Created by link on 2022/9/22.
//

import Foundation
import ParticleConnect

public class ParticleConnectSchemeManager: NSObject {
    @objc public static func handleUrl(_ url: URL) -> Bool {
        return ParticleConnect.handleUrl(url)
    }
}
