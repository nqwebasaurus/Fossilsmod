package fossils.fossils.client.blockentity.model.tanystropheus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TanystropheusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body2;
	private final ModelPart body4;
	private final ModelPart body;
	private final ModelPart neckbase;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart frontLeftLeg;
	private final ModelPart frontLeftLeg2;
	private final ModelPart frontLeftLeg3;
	private final ModelPart frontLeftLeg4;
	private final ModelPart frontRightLeg;
	private final ModelPart frontRightLeg2;
	private final ModelPart frontRightLeg3;
	private final ModelPart frontRightLeg4;
	private final ModelPart chest;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart neck6;
	private final ModelPart neck7;
	private final ModelPart neck8;
	private final ModelPart neck9;
	private final ModelPart neck10;
	private final ModelPart head;
	private final ModelPart lowerjaw;
	private final ModelPart upperjaw;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart body3;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart backLeftLeg;
	private final ModelPart backLeftLeg2;
	private final ModelPart backLeftLeg3;
	private final ModelPart backLeftLeg4;
	private final ModelPart backLeftLeg5;
	private final ModelPart backRightLeg;
	private final ModelPart backRightLeg2;
	private final ModelPart backRightLeg3;
	private final ModelPart backRightLeg4;
	private final ModelPart backRightLeg5;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail6;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart tail9;

	public TanystropheusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body2 = this.fossil.getChild("body2");
		this.body4 = this.body2.getChild("body4");
		this.body = this.body4.getChild("body");
		this.neckbase = this.body.getChild("neckbase");
		this.bone2 = this.neckbase.getChild("bone2");
		this.bone3 = this.neckbase.getChild("bone3");
		this.frontLeftLeg = this.neckbase.getChild("frontLeftLeg");
		this.frontLeftLeg2 = this.frontLeftLeg.getChild("frontLeftLeg2");
		this.frontLeftLeg3 = this.frontLeftLeg2.getChild("frontLeftLeg3");
		this.frontLeftLeg4 = this.frontLeftLeg3.getChild("frontLeftLeg4");
		this.frontRightLeg = this.neckbase.getChild("frontRightLeg");
		this.frontRightLeg2 = this.frontRightLeg.getChild("frontRightLeg2");
		this.frontRightLeg3 = this.frontRightLeg2.getChild("frontRightLeg3");
		this.frontRightLeg4 = this.frontRightLeg3.getChild("frontRightLeg4");
		this.chest = this.neckbase.getChild("chest");
		this.neck = this.chest.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.neck6 = this.neck5.getChild("neck6");
		this.neck7 = this.neck6.getChild("neck7");
		this.neck8 = this.neck7.getChild("neck8");
		this.neck9 = this.neck8.getChild("neck9");
		this.neck10 = this.neck9.getChild("neck10");
		this.head = this.neck10.getChild("head");
		this.lowerjaw = this.head.getChild("lowerjaw");
		this.upperjaw = this.head.getChild("upperjaw");
		this.leftFace = this.upperjaw.getChild("leftFace");
		this.rightFace = this.upperjaw.getChild("rightFace");
		this.body3 = this.body2.getChild("body3");
		this.bone = this.body3.getChild("bone");
		this.bone4 = this.body3.getChild("bone4");
		this.backLeftLeg = this.body3.getChild("backLeftLeg");
		this.backLeftLeg2 = this.backLeftLeg.getChild("backLeftLeg2");
		this.backLeftLeg3 = this.backLeftLeg2.getChild("backLeftLeg3");
		this.backLeftLeg4 = this.backLeftLeg3.getChild("backLeftLeg4");
		this.backLeftLeg5 = this.backLeftLeg4.getChild("backLeftLeg5");
		this.backRightLeg = this.body3.getChild("backRightLeg");
		this.backRightLeg2 = this.backRightLeg.getChild("backRightLeg2");
		this.backRightLeg3 = this.backRightLeg2.getChild("backRightLeg3");
		this.backRightLeg4 = this.backRightLeg3.getChild("backRightLeg4");
		this.backRightLeg5 = this.backRightLeg4.getChild("backRightLeg5");
		this.tail = this.body3.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail6 = this.tail3.getChild("tail6");
		this.tail4 = this.tail6.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail7 = this.tail5.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
		this.tail9 = this.tail8.getChild("tail9");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-1.2F, 0.0F, -0.5F, 1.0F, 16.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(4.4F, -16.0F, -11.1F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(3.5F, -5.0F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(4.4F, -16.0F, -11.1F, -0.3927F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(-0.15F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4F, -15.65F, 14.0F, 0.0873F, 0.0F, 1.5708F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1, 1).addBox(-0.7F, -1.35F, -0.5F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.4F, -15.65F, 14.0F, 0.0F, 0.0873F, 0.0F));

		PartDefinition body2 = fossil.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -16.0F, 3.1F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(91, 24).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, 3.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition body4 = body2.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.0F, 2.7F, 0.0443F, -0.1744F, -0.0077F));

		PartDefinition cube_r6 = body4.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(57, 60).addBox(-0.5F, 0.4F, 0.0F, 1.0F, 2.0F, 11.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, -10.7F, 0.0436F, 0.0F, 0.0F));

		PartDefinition body = body4.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3F, -10.2F, 0.0876F, -0.0869F, -0.0076F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(92, 14).addBox(-0.5F, 0.131F, 0.7269F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.05F, -8.3F, 0.1309F, 0.0F, 0.0F));

		PartDefinition neckbase = body.addOrReplaceChild("neckbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0151F, -7.3006F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r8 = neckbase.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 102).addBox(-0.5F, 0.5F, 0.5F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 1.3F, -6.8F, 0.2618F, 0.0F, 0.0F));

		PartDefinition bone2 = neckbase.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(6.1002F, 4.7778F, -0.2698F, 0.5672F, 0.0F, 0.0F));

		PartDefinition bone3 = neckbase.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.1002F, 4.7778F, -0.2698F, 0.5672F, 0.0F, 0.0F));

		PartDefinition frontLeftLeg = neckbase.addOrReplaceChild("frontLeftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(6.0342F, 5.1901F, -0.6552F, 0.4641F, 0.2073F, -0.2819F));

		PartDefinition frontLeftLeg2 = frontLeftLeg.addOrReplaceChild("frontLeftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.115F, 6.6807F, 1.1667F, -0.6999F, 0.149F, 0.3069F));

		PartDefinition frontLeftLeg3 = frontLeftLeg2.addOrReplaceChild("frontLeftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2697F, 6.4295F, -0.3617F, 0.3918F, 0.0334F, -0.0806F));

		PartDefinition frontLeftLeg4 = frontLeftLeg3.addOrReplaceChild("frontLeftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5F, 0.1F, -1.3F, -0.2618F, 0.0F, 0.0F));

		PartDefinition frontRightLeg = neckbase.addOrReplaceChild("frontRightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.0342F, 5.1901F, -0.6552F, 0.1109F, -0.0232F, 0.5095F));

		PartDefinition frontRightLeg2 = frontRightLeg.addOrReplaceChild("frontRightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.115F, 6.6807F, 1.1667F, -0.7606F, -0.0055F, -0.0871F));

		PartDefinition frontRightLeg3 = frontRightLeg2.addOrReplaceChild("frontRightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2697F, 6.4295F, -0.3617F, 1.1591F, 0.0805F, -0.4737F));

		PartDefinition frontRightLeg4 = frontRightLeg3.addOrReplaceChild("frontRightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5F, 0.1F, -1.3F, -0.6545F, 0.0F, 0.0F));

		PartDefinition chest = neckbase.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.4422F, -5.7078F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r9 = chest.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(51, 115).addBox(-0.5F, 0.4082F, -3.3353F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(83, 61).addBox(-0.5F, -0.2F, -8.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8801F, -2.4363F, -0.0134F, -0.2618F, 0.0035F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(35, 17).addBox(-0.5F, -0.3F, -12.9F, 1.0F, 2.0F, 13.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, 0.0799F, -7.799F, -0.1548F, -0.1802F, -0.0232F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(0, 19).addBox(-0.5F, -0.3F, -14.4F, 1.0F, 2.0F, 15.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0306F, -12.9228F, -0.1276F, -0.1749F, -0.0865F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0475F, -14.4804F, 0.0454F, -0.2579F, -0.0454F));

		PartDefinition cube_r10 = neck4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(56, 46).addBox(-0.5F, 0.7F, 0.7F, 1.0F, 2.0F, 11.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, -1.4062F, -10.8945F, -0.0436F, 0.0F, 0.0F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2611F, -9.6959F, 0.1756F, -0.3653F, -0.1474F));

		PartDefinition cube_r11 = neck5.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(66, 14).addBox(-0.5F, -0.7F, -0.9F, 1.0F, 2.0F, 10.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -2.3389F, -8.4929F, -0.2967F, 0.0F, 0.0F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.0785F, -9.2715F, 0.3374F, -0.2892F, -0.0997F));

		PartDefinition cube_r12 = neck6.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(67, 27).addBox(-0.5F, 0.725F, -0.85F, 1.0F, 2.0F, 10.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, -5.3428F, -6.7579F, -0.5585F, 0.0F, 0.0F));

		PartDefinition neck7 = neck6.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -5.3174F, -7.8831F, 0.1021F, -0.3474F, -0.0349F));

		PartDefinition cube_r13 = neck7.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 67).addBox(-0.5F, 0.5F, 0.125F, 1.0F, 2.0F, 10.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -5.5163F, -7.9086F, -0.5672F, 0.0F, 0.0F));

		PartDefinition neck8 = neck7.addOrReplaceChild("neck8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.4817F, -8.1471F, -0.0886F, -0.1739F, 0.0154F));

		PartDefinition cube_r14 = neck8.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(77, 74).addBox(-0.5F, 0.7704F, 0.0201F, 1.0F, 2.0F, 9.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, -4.1708F, -7.7288F, -0.3447F, 0.0F, 0.0F));

		PartDefinition neck9 = neck8.addOrReplaceChild("neck9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.2811F, -7.9392F, -0.1913F, -0.3794F, 0.1003F));

		PartDefinition cube_r15 = neck9.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(48, 87).addBox(-0.5F, 0.6972F, -0.1107F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.4868F, -7.6827F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck10 = neck9.addOrReplaceChild("neck10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1504F, -7.4769F, 0.3119F, -0.3488F, 0.0127F));

		PartDefinition cube_r16 = neck10.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(51, 107).addBox(-0.5F, 0.2019F, -4.4F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition head = neck10.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8982F, -3.3768F, 0.4358F, 0.0F, -0.0346F));

		PartDefinition lowerjaw = head.addOrReplaceChild("lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 0.9F, -0.6F, 0.3054F, 0.0F, 0.0F));

		PartDefinition upperjaw = head.addOrReplaceChild("upperjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6622F, -0.4282F, -0.5323F, 0.0F, 0.0F));

		PartDefinition leftFace = upperjaw.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.5212F, -0.5079F, -5.5428F));

		PartDefinition rightFace = upperjaw.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.5212F, -0.5079F, -5.5428F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.7263F, 9.6045F, 0.0694F, 0.1308F, -0.0057F));

		PartDefinition cube_r17 = body3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(78, 86).addBox(-0.5F, 1.5F, -6.7F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.5F, 6.9F, -0.2618F, 0.0F, 0.0F));

		PartDefinition bone = body3.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.8F, 2.6374F, 0.68F));

		PartDefinition bone4 = body3.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-1.8F, 2.6374F, 0.68F));

		PartDefinition backLeftLeg = body3.addOrReplaceChild("backLeftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5341F, 2.4296F, 0.9841F, -0.3786F, 0.033F, -0.1714F));

		PartDefinition backLeftLeg2 = backLeftLeg.addOrReplaceChild("backLeftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2906F, 10.0992F, 1.6968F, 1.8196F, -0.0384F, 0.0206F));

		PartDefinition backLeftLeg3 = backLeftLeg2.addOrReplaceChild("backLeftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0514F, 8.799F, 0.6879F, 0.0208F, 0.1294F, 0.0197F));

		PartDefinition backLeftLeg4 = backLeftLeg3.addOrReplaceChild("backLeftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0007F, 0.4836F, -3.7202F, -0.8727F, 0.0F, 0.0F));

		PartDefinition backLeftLeg5 = backLeftLeg4.addOrReplaceChild("backLeftLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0005F, -2.9856F, -0.5672F, 0.0F, 0.0F));

		PartDefinition backRightLeg = body3.addOrReplaceChild("backRightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5341F, 2.4296F, 0.9841F, -1.1311F, 0.1844F, 0.1568F));

		PartDefinition backRightLeg2 = backRightLeg.addOrReplaceChild("backRightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2906F, 10.0992F, 1.6968F, 1.2087F, 0.0384F, -0.0206F));

		PartDefinition backRightLeg3 = backRightLeg2.addOrReplaceChild("backRightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0514F, 8.799F, 0.6879F, 0.0635F, -0.0102F, -0.1088F));

		PartDefinition backRightLeg4 = backRightLeg3.addOrReplaceChild("backRightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0007F, 0.4836F, -3.7202F, -0.1309F, 0.0F, 0.0F));

		PartDefinition backRightLeg5 = backRightLeg4.addOrReplaceChild("backRightLeg5", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0005F, -2.9856F));

		PartDefinition tail = body3.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0098F, 7.6586F, -0.3452F, 0.2057F, -0.0733F));

		PartDefinition cube_r18 = tail.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(84, 40).addBox(-0.5F, 0.4F, 1.3F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.3109F, -1.0747F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9941F, 8.6901F, -0.2022F, 0.2139F, -0.0435F));

		PartDefinition cube_r19 = tail2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(27, 61).addBox(-0.5F, 0.1F, 0.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2206F, -0.0782F, 0.0873F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(106, 46).addBox(-0.5F, -0.4769F, 0.4966F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F))
				.texOffs(112, 52).addBox(-0.5F, -0.4769F, 7.1967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.6901F, 11.0216F, 0.0219F, 0.1309F, 0.0029F));

		PartDefinition tail6 = tail3.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(23, 88).addBox(-0.5F, 0.3226F, -0.0166F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.7995F, 7.8132F, 0.0781F, -0.2618F, -0.1308F));

		PartDefinition cube_r20 = tail6.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(31, 96).addBox(-0.55F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.8226F, 8.9834F, 0.0F, -0.4014F, 0.0F));

		PartDefinition tail4 = tail6.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 37).addBox(-0.5F, 0.2618F, -0.1303F, 1.0F, 1.0F, 13.0F, new CubeDeformation(-0.15F))
				.texOffs(11, 48).addBox(-0.5F, 0.2618F, 12.5697F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0938F, 8.8769F, 0.3496F, -0.369F, 0.1336F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(93, 0).addBox(-0.5F, 0.3672F, 0.0859F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.072F, 12.9386F, 0.0796F, -0.3014F, -0.05F));

		PartDefinition tail7 = tail5.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(69, 97).addBox(-0.5F, 0.3672F, -0.1141F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, -0.0473F, -0.2609F, -0.0216F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(88, 97).addBox(-0.5F, 0.3672F, -0.5141F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F))
				.texOffs(95, 104).addBox(-0.5F, 0.3672F, 7.1859F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.925F, 0.0714F, -0.4789F, -0.0329F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(66, 0).addBox(-0.5F, 0.3672F, -0.2141F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, 0.026F, -0.5208F, -0.0566F));

		return LayerDefinition.create(meshdefinition, 150, 150);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}