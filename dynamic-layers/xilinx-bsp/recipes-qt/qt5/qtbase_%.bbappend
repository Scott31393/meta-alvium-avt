PACKAGECONFIG:append = " \
  examples accessibility tools libinput fontconfig \
  ${@bb.utils.contains('DISTRO_FEATURES', 'fbdev', 'linuxfb gles2 eglfs', '', d)} \
  ${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'gles2 eglfs', '', d)} \
  ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'gles2 eglfs kms gbm', '', d)} \
  "

PACKAGECONFIG:remove = "tests"

# OpenGL comes from libmali on ev/eg, when egl is enabled
DEPENDS:mali400 += " libmali-xlnx"

PACKAGE_ARCH:mali400 = "${SOC_VARIANT_ARCH}"
