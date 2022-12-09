SUMMARY = "Allied Vision Alvium external Linux kernel module"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

inherit module

AVT_GIT_REPO = "alvium-csi2-driver"
AVT_GIT_BRANCH = "main"
<<<<<<< HEAD
SRCREV = "${AUTOREV}"
=======
SRCREV = "246b266e94ad8c8e521985a538fbfe83d4305ef3"
>>>>>>> 03069e7... avt-csi2-3: Set SRCREV to fixed commit and updated branch to main for release.

#Use ssh instead of https, because the repo is currently private
AVT_GIT_PROTOCOL = "ssh"

require recipes-avt/common/avt_git.inc

S = "${WORKDIR}/git"

PV = "2022-1-beta+git${SRCPV}"

# The inherit of module.bbclass will automatically name module packages with
# "kernel-module-" prefix as required by the oe-core build environment.

RPROVIDES_${PN} += "kernel-module-avt-csi2-3"

FILES_${PN} += "${libdir}/modules/${KERNEL_VERSION}/extra/*.ko"
#FILES_${PN} += "${nonarch_base_libdir}/modules/${KERNEL_VERSION}/extra/*.ko"

LOCALVERSION = "1.0.0"
KERNEL_MODULE_AUTOLOAD += "avt-csi2-3"

