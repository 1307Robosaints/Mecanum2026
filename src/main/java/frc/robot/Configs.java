package frc.robot;

import com.revrobotics.spark.config.SparkMaxConfig;
import com.revrobotics.spark.FeedbackSensor;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;

public final class Configs {
      public static final class MAXSwerveModule {

       public static final SparkMaxConfig drivingConfig = new SparkMaxConfig();
        static{
            drivingConfig
                    .idleMode(IdleMode.kBrake)
                    .smartCurrentLimit(50);
                    
                }
      }
}
