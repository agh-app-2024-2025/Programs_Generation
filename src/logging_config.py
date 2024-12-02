import sys
from loguru import logger


class LoggingConfig:
    @classmethod
    def config(cls, level_arg: str):
        logger.remove(0)
        logger.add(sys.stdout, level=cls.get_level(level_arg))
        logger.add("logs/scraper_{time}.log", level="TRACE")

    @classmethod
    def get_level(cls, level_arg: str):
        match level_arg:
            case "t" | "trc" | "trace":
                return "TRACE"
            case "d" | "dbg" | "debug":
                return "DEBUG"
            case "i" | "inf" | "info" | "information":
                return "INFO"
            case "s" | "succ" | "success":
                return "SUCCESS"
            case "w" | "wrn" | "warn" | "warning":
                return "WARNING"
            case "e" | "err" | "error":
                return "ERROR"
            case "c" | "crl" | "critical":
                return "CRITICAL"
            case _:
                return "INFO"
